package xyz.jovanstoiljkovic.starter.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import xyz.jovanstoiljkovic.starter.models.Menu;

@Service
public class MenuService extends BaseService<Menu> {

	@Override
	public Optional<Menu> updatePatch(Long id, Menu item) {
		Optional<Menu> op = repo.findById(id);

		if (op.isEmpty())
			return op;

		Menu entity = op.get();

		if (item.getVersion() != null)
			entity.setVersion(item.getVersion());

		if (item.getFood() != null)
			entity.setFood(item.getFood());

		if (item.getCategory() != null)
			entity.setCategory(item.getCategory());

		repo.save(entity);
		return Optional.of(entity);
	}

}
