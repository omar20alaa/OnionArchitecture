package app.domain.usecase

import app.domain.repo.MealsRepo

class GetMeals(private val mealsRepo: MealsRepo) {

    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()

}