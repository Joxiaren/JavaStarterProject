ARG NODE_VERSION=lts-alpine3.22
ARG NGINX_VERSION=alpine3.22

FROM node:${NODE_VERSION} AS builder

WORKDIR /app

COPY package.json *package-lock.json* ./

RUN --mount=type=cache,target=/root/.npm npm ci

COPY . .

RUN npm run build


FROM nginxinc/nginx-unprivileged:${NGINX_VERSION} AS runner

COPY nginx.conf /etc/nginx/nginx.conf
COPY --chown=nginx:nginx --from=builder /app/dist/*/browser /usr/share/nginx/html

USER nginx

EXPOSE 8080

ENTRYPOINT ["nginx", "-c", "/etc/nginx/nginx.conf"]
CMD ["-g", "daemon off;"]