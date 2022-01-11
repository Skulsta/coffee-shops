package com.okta.kotlin

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ResourceServerApplication  {
	@Bean
	fun run(repository: CharacterRepository) = ApplicationRunner {
		repository.save(CharacterModel("Leah", "Cindersap Forest", "Leah's Cottage", listOf("Goat Cheese", "Salad", "Wine")))
		repository.save(CharacterModel("Emily", "Pelican Town", "2 Willow Lane", listOf("Cloth", "Survival Burger", "Wool")))
		repository.save(CharacterModel("Penny", "Pelican Town", "Trailer", listOf("Melon", "Poppy", "Roots Platter")))
		repository.save(CharacterModel("Sam", "Pelican Town", "1 Willow Lane", listOf("Pizza", "Cactus Fruit")))
		repository.save(CharacterModel("Robin", "The Mountain", "24 Mountain Road", listOf("Goat cheese", "Peach", "Spaghetti")))
		repository.save(CharacterModel("Alex", "Pelican Town", "1 River Road", listOf("Complete Breakfast")))
		repository.save(CharacterModel("Elliot", "The Bearch", "Elliott's Cabin", listOf("Duck Feather", "Squid Ink", "Pomegranate")))
		repository.save(CharacterModel("Harvey", "Pelican Town", "Medical Clinic", listOf("Coffee", "Pickles", "Wine")))
		repository.save(CharacterModel("Sebastian", "The Mountain", "24 Mountain Road", listOf("Pumpkin soup", "Frozen tear", "Sashimi")))
		repository.save(CharacterModel("Shane", "Cindersap Forest", "Marnie's Ranch", listOf("Beer", "Hot pepper", "Pizza")))
		repository.save(CharacterModel("Abigail", "Pelican Town", "Pierre's General Store", listOf("Amethyst", "Pufferfish", "Pumpkin")))
		repository.save(CharacterModel("Haley", "Pelican Town", "2 Willow Lane", listOf("Coconut", "Fruit salad", "Sunflower")))
		repository.save(CharacterModel("Maru", "The Mountain", "24 Mountain Road", listOf("Cauliflower", "Strawberry", "Miner's Treat")))
		repository.save(CharacterModel("Caroline", "Pelican Town", "Pierre's General Store", listOf("Fish taco", "Green tea", "Tropical Curry")))
		repository.save(CharacterModel("Clint", "Pelican Town", "Blacksmith", listOf("Amathyst", "Topaz", "Fiddlehead Risotto", "Jade")))
		repository.save(CharacterModel("Demetrius", "The Mountain", "24 Mountain Road", listOf("Bean hotpot", "Strawberry", "Rice pudding")))
		repository.save(CharacterModel("Dwarf", "The Mines", "Eastern Cave", listOf("Amethyst", "Jade", "Topaz")))
		repository.save(CharacterModel("Evelyn", "Pelican Town", "1 River Road", listOf("Beet", "Fairly Rose", "Tulip", "Stuffing")))
		repository.save(CharacterModel("George", "Pelican Town", "1 River Road", listOf("Fried Mushroom", "Leek")))
		repository.save(CharacterModel("Gus", "Pelican Town", "The Stardrop Saloon", listOf("Fish Taco", "Orange", "Tropical Curry")))
		repository.save(CharacterModel("Jas", "Cindsap Forest", "Marnie's Ranch", listOf("Fairy Rose", "Plum Pudding")))
		repository.save(CharacterModel("Jodi", "Pelican Town", "1 Willow Lane", listOf("Fried Eel", "Pancakes", "Eggplant Parmesan")))
		repository.save(CharacterModel("Kent", "Pelican Town", "1 Willow Lane", listOf("Fiddlehead Risotto", "Roasted Hazelnuts")))
		repository.save(CharacterModel("Krobus", "The Sewers", "Krobus's Shop", listOf("Pumpkin", "Void Mayonnaise", "Wild Horseradish")))
		repository.save(CharacterModel("Leo", "Ginger Island", "Hut/Treehouse", listOf("Duck Feather", "Mango", "Ostrich Egg")))
		repository.save(CharacterModel("Lewis", "Pelican Town", "Mayor's Manor", listOf("Green Tea", "Hot Pepper", "Vegetable Medley")))
		repository.save(CharacterModel("Linus", "The Mountain", "Tent", listOf("Cactus Fruit", "Coconut", "Dish O' The Sea", "Yam")))
		repository.save(CharacterModel("Marnie", "Cindersap Forest", "Marnie's Ranch", listOf("Farmer's Lunch", "Pumpkin Pie")))
		repository.save(CharacterModel("Pam", "Pelican Town", "Trailer", listOf("Beer", "Cactus Fruit", "Mead", "Parsnip", "Pale Ale")))
		repository.save(CharacterModel("Pierre", "Pelican Town", "Pierre's General Store", listOf("Fried Calamari")))
		repository.save(CharacterModel("Sandy", "The Desert", "Oasis", listOf("Crocus", "Daffodil", "Sweet Pea")))
		repository.save(CharacterModel("Vincent", "Pelican Town", "1 Willow Lane", listOf("Grape", "Snail", "Ginger Ale")))
		repository.save(CharacterModel("Willy", "The Beach", "Fish Store", listOf("Catfish", "Mead", "Pumpkin", "Sturgeon", "Octopus")))
		repository.save(CharacterModel("Wizard", "Cindersap Forest", "Wizard's Tower", listOf("Purple Mushroom", "Solar Essence", "Void Essence", "Super Cucumber")))
	}
}

fun main(args: Array<String>) {
	runApplication<ResourceServerApplication>(*args)
}