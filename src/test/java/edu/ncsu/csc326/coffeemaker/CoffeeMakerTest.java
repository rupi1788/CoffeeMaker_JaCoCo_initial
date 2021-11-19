package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Sarah Heckman
 *
 * Extended by Mike Whalen
 *
 * Unit tests for CoffeeMaker class.
 */

public class CoffeeMakerTest extends TestCase {

	private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;
	private Recipe r5;
	private Recipe recipe1;
	private Recipe recipe2;
	private Recipe recipe3;
	private Recipe recipe4;
	private Recipe recipe5;
	private CoffeeMaker coffeeMaker;

	private CoffeeMaker cm;
	private RecipeBook recipeBookStub;
	private Recipe[] stubRecipies;

	protected void setUp() throws Exception {

		coffeeMaker = new CoffeeMaker();

		//Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setAmtChocolate("0");
		r1.setAmtCoffee("3");
		r1.setAmtMilk("1");
		r1.setAmtSugar("1");
		r1.setPrice("50");

		//Set up for r2
		r2 = new Recipe();
		r2.setName("Mocha");
		r2.setAmtChocolate("20");
		r2.setAmtCoffee("3");
		r2.setAmtMilk("1");
		r2.setAmtSugar("1");
		r2.setPrice("75");

		//Set up for r3
		r3 = new Recipe();
		r3.setName("Latte");
		r3.setAmtChocolate("0");
		r3.setAmtCoffee("3");
		r3.setAmtMilk("3");
		r3.setAmtSugar("1");
		r3.setPrice("100");

		//Set up for r4
		r4 = new Recipe();
		r4.setName("Hot Chocolate");
		r4.setAmtChocolate("4");
		r4.setAmtCoffee("0");
		r4.setAmtMilk("1");
		r4.setAmtSugar("1");
		r4.setPrice("65");

		//Set up for r5 (added by MWW)
		r5 = new Recipe();
		r5.setName("Super Hot Chocolate");
		r5.setAmtChocolate("6");
		r5.setAmtCoffee("0");
		r5.setAmtMilk("1");
		r5.setAmtSugar("1");
		r5.setPrice("100");

		stubRecipies = new Recipe[]{r1, r2, r3};

		super.setUp();
	}


	// put your tests here!

	@Test
	public void testMakeCoffee01() {
		assertTrue(true);
	}


	/**
	 * Given a coffeemaker with initialize recipes to test
	 * When we add new recipe where
	 *   no space available
	 * @throws RecipeException
	 */
	@Test
	public void testAddRecipeHavingNoPlaceToAdd2() throws RecipeException {
		CoffeeMaker coffeeMaker8= new CoffeeMaker();
		//Set up for r1
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker8.addRecipe(recipe1);

		//Set up for r2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("20");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker8.addRecipe(recipe2);

		//Set up for r3
		recipe3 = new Recipe();
		recipe3.setName("Latte");
		recipe3.setAmtChocolate("0");
		recipe3.setAmtCoffee("3");
		recipe3.setAmtMilk("3");
		recipe3.setAmtSugar("1");
		recipe3.setPrice("100");
		coffeeMaker8.addRecipe(recipe3);

		//Set up for r4
		recipe4 = new Recipe();
		recipe4.setName("Hot Chocolate");
		recipe4.setAmtChocolate("4");
		recipe4.setAmtCoffee("0");
		recipe4.setAmtMilk("1");
		recipe4.setAmtSugar("1");
		recipe4.setPrice("75");
		coffeeMaker8.addRecipe(recipe4);

		//Set up for r5
		recipe5 = new Recipe();
		recipe5.setName("Super Hot Chocolate");
		recipe5.setAmtChocolate("6");
		recipe5.setAmtCoffee("0");
		recipe5.setAmtMilk("1");
		recipe5.setAmtSugar("1");
		recipe5.setPrice("100");
		assertFalse( coffeeMaker8.addRecipe(recipe5));

	}

	@Test
	public void testAddRecipeOnAlreadyFilledPlace3() throws RecipeException {
		CoffeeMaker coffeeMaker8= new CoffeeMaker();
		//Set up for r1
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker8.addRecipe(recipe1);

		//Set up for r2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("20");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker8.addRecipe(recipe2);

		//Set up for r3
		recipe3 = new Recipe();
		recipe3.setName("Latte");
		recipe3.setAmtChocolate("0");
		recipe3.setAmtCoffee("3");
		recipe3.setAmtMilk("3");
		recipe3.setAmtSugar("1");
		recipe3.setPrice("100");
		coffeeMaker8.addRecipe(recipe3);

		//Set up for r4
		recipe4 = new Recipe();
		recipe4.setName("Hot Chocolate");
		recipe4.setAmtChocolate("4");
		recipe4.setAmtCoffee("0");
		recipe4.setAmtMilk("1");
		recipe4.setAmtSugar("1");
		recipe4.setPrice("75");
		coffeeMaker8.addRecipe(recipe4);

		//Set up for r5
		recipe2 = new Recipe();
		recipe2.setName("Super Hot Chocolate");
		recipe2.setAmtChocolate("6");
		recipe2.setAmtCoffee("0");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("100");
		assertFalse( coffeeMaker8.addRecipe(recipe2));

	}

	@Test
	public void testAddRecipeHavingNoPlaceToAdd1() throws RecipeException {
		CoffeeMaker coffeeMaker8= new CoffeeMaker();
		//Set up for r1
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker8.addRecipe(recipe1);

		//Set up for r2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("20");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker8.addRecipe(recipe2);

		//Set up for r3
		recipe3 = new Recipe();
		recipe3.setName("Latte");
		recipe3.setAmtChocolate("0");
		recipe3.setAmtCoffee("3");
		recipe3.setAmtMilk("3");
		recipe3.setAmtSugar("1");
		recipe3.setPrice("100");
		coffeeMaker8.addRecipe(recipe3);

		//Set up for r4
		recipe4 = new Recipe();
		recipe4.setName("Hot Chocolate");
		recipe4.setAmtChocolate("4");
		recipe4.setAmtCoffee("0");
		recipe4.setAmtMilk("1");
		recipe4.setAmtSugar("1");
		recipe4.setPrice("75");
		assertFalse( coffeeMaker8.addRecipe(recipe4));

	}


	/**
	 * Given a coffeemaker with three initialize recipes to test
	 * When we add fourth recipe
	 * that already exist
	 * return false
	 *
	 * @throws RecipeException
	 */

	@Test
	public void testAddRecipeAlreadyExist() throws RecipeException {
		CoffeeMaker coffeeMaker8 = new CoffeeMaker();
		//Set up for r1
		recipe1 = new Recipe();
		recipe1.setName("Coffee");

		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker8.addRecipe(recipe1);

		//Set up for r2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker8.addRecipe(recipe2);

		//Set up for r3
		recipe3 = new Recipe();
		recipe3.setName("Latte");
		recipe3.setAmtChocolate("0");
		recipe3.setAmtCoffee("3");
		recipe3.setAmtMilk("3");
		recipe3.setAmtSugar("1");
		recipe3.setPrice("100");
		coffeeMaker8.addRecipe(recipe3);

		//Set up for r4
		recipe4 = new Recipe();
		recipe4.setName("Mocha");
		recipe4.setAmtChocolate("2");
		recipe4.setAmtCoffee("3");
		recipe4.setAmtMilk("1");
		recipe4.setAmtSugar("1");
		recipe4.setPrice("75");

		assertFalse(coffeeMaker8.addRecipe(recipe4));

	}


	@Test
	public void testAddRecipeWithNameError1() throws RecipeException {
		CoffeeMaker coffeeMaker8 = new CoffeeMaker();
		//Set up for r1
		recipe1 = new Recipe();
		recipe1.setName("Mocha");

		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker8.addRecipe(recipe1);

		//Set up for r2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");

		assertFalse(coffeeMaker8.addRecipe(recipe2));

	}

	@Test
	public void testAddRecipeWithNameError2() throws RecipeException {
		CoffeeMaker coffeeMaker8 = new CoffeeMaker();
		//Set up for r1
		recipe1 = new Recipe();
		recipe1.setName(null);
		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker8.addRecipe(recipe1);

		//Set up for r2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker8.addRecipe(recipe2);

		//Set up for r3
		recipe3 = new Recipe();
		recipe3.setName("Latte");
		recipe3.setAmtChocolate("0");
		recipe3.setAmtCoffee("3");
		recipe3.setAmtMilk("3");
		recipe3.setAmtSugar("1");
		recipe3.setPrice("100");
		coffeeMaker8.addRecipe(recipe3);

		//Set up for r4
		recipe4 = new Recipe();
		recipe4.setName("Mocha");
		recipe4.setAmtChocolate("2");
		recipe4.setAmtCoffee("3");
		recipe4.setAmtMilk("1");
		recipe4.setAmtSugar("1");
		recipe4.setPrice("75");

		assertFalse(coffeeMaker8.addRecipe(recipe1));

	}


	/**
	 * Given a coffee maker with the three recipe
	 * When we delete a recipe with valid input (recipe to delete)
	 * Then we  get name of deleted recipe.
	 *
	 * @throws RecipeException if there was an error parsing the recipe to delete.
	 */
	@Test
	public void testDeleteRecipe1() throws RecipeException {
		CoffeeMaker coffeeMaker9 = new CoffeeMaker();
		//Set up for r1
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker9.addRecipe(recipe1);

		//Set up for r2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker9.addRecipe(recipe2);

		//Set up for r3
		recipe3 = new Recipe();
		recipe3.setName("Latte");
		recipe3.setAmtChocolate("0");
		recipe3.setAmtCoffee("3");
		recipe3.setAmtMilk("3");
		recipe3.setAmtSugar("1");
		recipe3.setPrice("100");
		coffeeMaker9.addRecipe(recipe3);


		assertEquals("Latte", coffeeMaker9.deleteRecipe(2));

	}

	/**
	 * Given a coffee maker with the three recipe
	 * When we delete a recipe with valid input (recipe to delete)
	 * Then we  get name of deleted recipe.
	 *
	 * @throws RecipeException if there was an error parsing the recipe to delete.
	 */
	@Test
	public void testDeleteRecipe2() throws RecipeException {
		CoffeeMaker coffeeMaker9a = new CoffeeMaker();
		//Set up for r1
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker9a.addRecipe(recipe1);

		//Set up for r2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker9a.addRecipe(recipe2);

		//Set up for r3
//		recipe3 = new Recipe();
//		recipe3.setName("Latte");
//		recipe3.setAmtChocolate("0");
//		recipe3.setAmtCoffee("3");
//		recipe3.setAmtMilk("3");
//		recipe3.setAmtSugar("1");
//		recipe3.setPrice("100");
//		coffeeMaker9a.addRecipe(recipe3);


		Assert.assertNull(coffeeMaker9a.deleteRecipe(2));

	}

	/**
	 * Given a coffee maker with the default inventory
	 * When we add inventory with well-formed quantities
	 * Then we do not get an exception trying to read the inventory quantities.
	 *
	 * @throws InventoryException if there was an error parsing the quanity
	 *                            to a positive integer.
	 */
	@Test
	public void testAddInventory1() throws InventoryException {
		coffeeMaker.addInventory("4", "7", "0", "9");
	}


	/**
	 * Given a coffee maker with the default inventory
	 * When we add inventory with malformed quantities (i.e., a negative
	 * quantity and a non-numeric string)
	 * Then we get an inventory exception
	 *
	 * @throws InventoryException if there was an error parsing the quanity
	 *                            to a positive integer.
	 */
	@Test
	public void testAddInventoryExceptionForChocolate1() {
		try {
			coffeeMaker.addInventory("4", "1", "0", "-3");
		} catch (InventoryException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testAddInventoryExceptionForChocolate2() {
		try {
			coffeeMaker.addInventory("4", "1", "0", "abc");
		} catch (InventoryException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testAddInventoryExceptionForCoffee1() {
		try {
			coffeeMaker.addInventory("-4", "1", "0", "3");
		} catch (InventoryException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testAddInventoryExceptionForCoffee2() {
		try {
			coffeeMaker.addInventory("efg", "1", "0", "3");
		} catch (InventoryException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testAddInventoryExceptionForMilk1() {
		try {
			coffeeMaker.addInventory("4", "-10", "0", "3");
		} catch (InventoryException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testAddInventoryExceptionForMilk2() {
		try {
			coffeeMaker.addInventory("4", "pqr", "0", "3");
		} catch (InventoryException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testAddInventoryExceptionForSugar1()  {
		try {
			coffeeMaker.addInventory("4", "1", "-4", "3");
		}
		catch (InventoryException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testAddInventoryExceptionForSugar2() {
		try {
			coffeeMaker.addInventory("4", "1", "xyz", "3");
		} catch (InventoryException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	/**
	 * Given a coffee maker with one existing inventory
	 * having each ingredient amount 15
	 * When we check inventory
	 * Then we get the correct list of ingredients
	 * with correct amount available.
	 */
	@Test
	public void testCheckInventory1() {
		CoffeeMaker coffeeMaker4 = new CoffeeMaker();
		assertEquals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n", coffeeMaker4.checkInventory());
	}

	@Test
	public void testCheckInventory2() throws InventoryException {
		CoffeeMaker coffeeMaker5 = new CoffeeMaker();
		coffeeMaker5.addInventory("15", "15", "0", "15");
		assertEquals("Coffee: 30\nMilk: 30\nSugar: 15\nChocolate: 30\n", coffeeMaker5.checkInventory());
	}


	/**
	 * Given a coffee maker with one valid recipe
	 * When we make coffee, selecting the valid recipe and paying more than
	 * the coffee costs
	 * Then we get the correct change back.
	 */
	@Test
	public void testMakeCoffee1() throws RecipeException {
		CoffeeMaker coffeeMaker10 = new CoffeeMaker();
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("2");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker10.addRecipe(recipe1);
		assertEquals(25, coffeeMaker10.makeCoffee(0, 75));
	}


	/**
	 * Given a coffee maker with one valid recipe
	 * When we make coffee, selecting the valid recipe and paying equal to
	 * the coffee costs
	 * Then we get the correct change back.
	 */

	@Test
	public void testMakeCoffee2() throws RecipeException {
		CoffeeMaker coffeeMaker1 = new CoffeeMaker();
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("2");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");

		coffeeMaker1.addRecipe(recipe1);
		assertEquals(0, coffeeMaker1.makeCoffee(0, 50));
	}


	/**
	 * Given a coffee maker with one valid recipe
	 * When we make coffee, selecting the valid recipe and paying less than
	 * the coffee costs
	 * Then we get the amount paid back.
	 */
	@Test
	public void testMakeCoffee3() throws RecipeException {
		CoffeeMaker coffeeMaker2 = new CoffeeMaker();
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("2");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker2.addRecipe(recipe1);

		assertEquals(25, coffeeMaker2.makeCoffee(0, 25));
	}

	/**
	 * Given a coffee maker with one valid recipe but in
	 * the inventory one ingredient is not available
	 * When we make coffee, selecting the valid recipe and paying more than
	 * the coffee costs
	 * <p>
	 * Then we get the amount paid back.
	 */
	@Test
	public void testMakeCoffeeWithoutChocolate4() throws RecipeException {
		CoffeeMaker coffeeMaker3 = new CoffeeMaker();
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("20");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker3.addRecipe(recipe2);

		assertEquals(100, coffeeMaker3.makeCoffee(0, 100));
	}
	@Test
	public void testMakeCoffeeWithoutCoffee4() throws RecipeException {
		CoffeeMaker coffeeMaker3 = new CoffeeMaker();
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("30");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker3.addRecipe(recipe2);

		assertEquals(100, coffeeMaker3.makeCoffee(0, 100));
	}
	@Test
	public void testMakeCoffeeWithoutMilk4() throws RecipeException {
		CoffeeMaker coffeeMaker3 = new CoffeeMaker();
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("24");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker3.addRecipe(recipe2);

		assertEquals(100, coffeeMaker3.makeCoffee(0, 100));
	}
	@Test
	public void testMakeCoffeeWithoutSugar4() throws RecipeException {
		CoffeeMaker coffeeMaker3 = new CoffeeMaker();
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("21");
		recipe2.setPrice("75");
		coffeeMaker3.addRecipe(recipe2);

		assertEquals(100, coffeeMaker3.makeCoffee(0, 100));
	}

	/**
	 * Given a coffee maker with two valid recipe
	 * When we make coffee, selecting the valid recipe and paying equal to
	 * the coffee costs
	 * Then we get the amount paid back.
	 */
	@Test
	public void testMakeCoffee5() throws RecipeException {

		CoffeeMaker coffeeMaker1 = new CoffeeMaker();

		//Set up for r1
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker1.addRecipe(recipe1);

		//Set up for r2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker1.addRecipe(recipe2);

		assertEquals(0, coffeeMaker1.makeCoffee(1, 75));
	}

	/**
	 * Given a coffee maker with one valid recipe
	 * When we make coffee, selecting the recipe not available and paying more than
	 * the coffee costs
	 * Then we get the amount paid back.
	 */
	@Test
	public void testMakeCoffee6() throws RecipeException {
		CoffeeMaker coffeeMaker11 = new CoffeeMaker();
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("2");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker11.addRecipe(recipe1);

		assertEquals(75, coffeeMaker11.makeCoffee(2, 75));
	}

	/**
	 * Given a coffee maker with the two recipe
	 * When we edit a recipe with valid input
	 * (positive int value of ingredients)
	 * Then we  get name of edited recipe.
	 *
	 * @throws RecipeException if there was an error in ingredients value
	 *                         or select empty recipe.
	 */
	@Test
	public void testEditRecipe1() throws RecipeException {
		CoffeeMaker coffeeMaker12 = new CoffeeMaker();
		//Set up for r1
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker12.addRecipe(recipe1);

		//Set up for r2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker12.addRecipe(recipe2);

		//Set up for r3
		recipe3 = new Recipe();
		recipe3.setAmtChocolate("3");
		recipe3.setAmtCoffee("3");
		recipe3.setAmtMilk("3");
		recipe3.setAmtSugar("1");
		recipe3.setPrice("100");
		assertEquals("Mocha", coffeeMaker12.editRecipe(1, recipe3));
	}

	/**
	 * Given a coffee maker with the two recipe
	 * When we edit a recipe with valid input
	 * (positive int value of ingredients)
	 * but the recipe which we want to edit
	 * doesn't exist
	 * Then we  get null return.
	 *
	 * @throws RecipeException if there was an error in ingredients value
	 *                         or select empty recipe.
	 */
	@Test(expected = InventoryException.class)
	public void testEditRecipe2() throws RecipeException {
		CoffeeMaker coffeeMaker13 = new CoffeeMaker();
		//Set up for r1
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		coffeeMaker13.addRecipe(recipe1);

		//Set up for r2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		coffeeMaker13.addRecipe(recipe2);

		//Set up for r3
		recipe3 = new Recipe();
		recipe3.setAmtChocolate("3");
		recipe3.setAmtCoffee("3");
		recipe3.setAmtMilk("5");
		recipe3.setAmtSugar("1");
		recipe3.setPrice("100");


		Assert.assertNull(coffeeMaker13.editRecipe(2, recipe3));
	}

	/**
	 * Given a coffee maker with the two recipe
	 * When we edit a recipe with invalid input
	 * (negative int value or alphabetical values of ingredients)
	 * Then we  get exception error.
	 *
	 * @throws RecipeException if there was an error in ingredients value
	 *                         or select empty recipe.
	 */
	@Test
	public void testEditRecipeWithSugarError3() {
		try {
			CoffeeMaker coffeeMaker13a = new CoffeeMaker();
			//Set up for r1
			recipe1 = new Recipe();
			recipe1.setName("Coffee");
			recipe1.setAmtChocolate("0");
			recipe1.setAmtCoffee("3");
			recipe1.setAmtMilk("1");
			recipe1.setAmtSugar("1");
			recipe1.setPrice("50");
			coffeeMaker13a.addRecipe(recipe1);

			//Set up for r2
			recipe2 = new Recipe();
			recipe2.setName("Mocha");
			recipe2.setAmtChocolate("2");
			recipe2.setAmtCoffee("3");
			recipe2.setAmtMilk("1");
			recipe2.setAmtSugar("1");
			recipe2.setPrice("75");
			coffeeMaker13a.addRecipe(recipe2);

			//Set up for r3
			recipe3 = new Recipe();
			recipe3.setAmtChocolate("3");
			recipe3.setAmtCoffee("3");
			recipe3.setAmtMilk("5");
			recipe3.setAmtSugar("-1");
			recipe3.setPrice("100");

			coffeeMaker13a.editRecipe(1, recipe3);
		} catch (RecipeException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}


	@Test
	public void testEditRecipeWithSugarError4() {
		try {
			CoffeeMaker coffeeMaker13a = new CoffeeMaker();
			//Set up for r1
			recipe1 = new Recipe();
			recipe1.setName("Coffee");
			recipe1.setAmtChocolate("0");
			recipe1.setAmtCoffee("3");
			recipe1.setAmtMilk("1");
			recipe1.setAmtSugar("1");
			recipe1.setPrice("50");
			coffeeMaker13a.addRecipe(recipe1);

			//Set up for r2
			recipe2 = new Recipe();
			recipe2.setName("Mocha");
			recipe2.setAmtChocolate("2");
			recipe2.setAmtCoffee("3");
			recipe2.setAmtMilk("1");
			recipe2.setAmtSugar("1");
			recipe2.setPrice("75");
			coffeeMaker13a.addRecipe(recipe2);

			//Set up for r3
			recipe3 = new Recipe();
			recipe3.setAmtChocolate("3");
			recipe3.setAmtCoffee("3");
			recipe3.setAmtMilk("5");
			recipe3.setAmtSugar("abc");
			recipe3.setPrice("100");

			coffeeMaker13a.editRecipe(1, recipe3);
		} catch (RecipeException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testEditRecipeWithPriceError5() {
		try{
			CoffeeMaker coffeeMaker13a= new CoffeeMaker();
			//Set up for r1
			recipe1 = new Recipe();
			recipe1.setName("Coffee");
			recipe1.setAmtChocolate("0");
			recipe1.setAmtCoffee("3");
			recipe1.setAmtMilk("1");
			recipe1.setAmtSugar("1");
			recipe1.setPrice("50");
			coffeeMaker13a.addRecipe(recipe1);

			//Set up for r2
			recipe2 = new Recipe();
			recipe2.setName("Mocha");
			recipe2.setAmtChocolate("2");
			recipe2.setAmtCoffee("3");
			recipe2.setAmtMilk("1");
			recipe2.setAmtSugar("1");
			recipe2.setPrice("75");
			coffeeMaker13a.addRecipe(recipe2);

			//Set up for r3
			recipe3 = new Recipe();
			recipe3.setAmtChocolate("3");
			recipe3.setAmtCoffee("3");
			recipe3.setAmtMilk("5");
			recipe3.setAmtSugar("1");
			recipe3.setPrice("-100");

			coffeeMaker13a.editRecipe(1,recipe3);
		}
		catch (RecipeException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testEditRecipeWithPriceError6() {
		try{
			CoffeeMaker coffeeMaker13a= new CoffeeMaker();
			//Set up for r1
			recipe1 = new Recipe();
			recipe1.setName("Coffee");
			recipe1.setAmtChocolate("0");
			recipe1.setAmtCoffee("3");
			recipe1.setAmtMilk("1");
			recipe1.setAmtSugar("1");
			recipe1.setPrice("50");
			coffeeMaker13a.addRecipe(recipe1);

			//Set up for r2
			recipe2 = new Recipe();
			recipe2.setName("Mocha");
			recipe2.setAmtChocolate("2");
			recipe2.setAmtCoffee("3");
			recipe2.setAmtMilk("1");
			recipe2.setAmtSugar("1");
			recipe2.setPrice("75");
			coffeeMaker13a.addRecipe(recipe2);

			//Set up for r3
			recipe3 = new Recipe();
			recipe3.setAmtChocolate("3");
			recipe3.setAmtCoffee("3");
			recipe3.setAmtMilk("5");
			recipe3.setAmtSugar("1");
			recipe3.setPrice("xyz");

			coffeeMaker13a.editRecipe(1,recipe3);
		}
		catch (RecipeException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testEditRecipeWithMilkError7() {
		try{
			CoffeeMaker coffeeMaker13a= new CoffeeMaker();
			//Set up for r1
			recipe1 = new Recipe();
			recipe1.setName("Coffee");
			recipe1.setAmtChocolate("0");
			recipe1.setAmtCoffee("3");
			recipe1.setAmtMilk("1");
			recipe1.setAmtSugar("1");
			recipe1.setPrice("50");
			coffeeMaker13a.addRecipe(recipe1);

			//Set up for r2
			recipe2 = new Recipe();
			recipe2.setName("Mocha");
			recipe2.setAmtChocolate("2");
			recipe2.setAmtCoffee("3");
			recipe2.setAmtMilk("1");
			recipe2.setAmtSugar("1");
			recipe2.setPrice("75");
			coffeeMaker13a.addRecipe(recipe2);

			//Set up for r3
			recipe3 = new Recipe();
			recipe3.setAmtChocolate("3");
			recipe3.setAmtCoffee("3");
			recipe3.setAmtMilk("-5");
			recipe3.setAmtSugar("1");
			recipe3.setPrice("100");

			coffeeMaker13a.editRecipe(1,recipe3);
		}
		catch (RecipeException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testEditRecipeWithMilkError8() {
		try{
			CoffeeMaker coffeeMaker13a= new CoffeeMaker();
			//Set up for r1
			recipe1 = new Recipe();
			recipe1.setName("Coffee");
			recipe1.setAmtChocolate("0");
			recipe1.setAmtCoffee("3");
			recipe1.setAmtMilk("1");
			recipe1.setAmtSugar("1");
			recipe1.setPrice("50");
			coffeeMaker13a.addRecipe(recipe1);

			//Set up for r2
			recipe2 = new Recipe();
			recipe2.setName("Mocha");
			recipe2.setAmtChocolate("2");
			recipe2.setAmtCoffee("3");
			recipe2.setAmtMilk("1");
			recipe2.setAmtSugar("1");
			recipe2.setPrice("75");
			coffeeMaker13a.addRecipe(recipe2);

			//Set up for r3
			recipe3 = new Recipe();
			recipe3.setAmtChocolate("3");
			recipe3.setAmtCoffee("3");
			recipe3.setAmtMilk("abc");
			recipe3.setAmtSugar("1");
			recipe3.setPrice("100");

			coffeeMaker13a.editRecipe(1,recipe3);
		}
		catch (RecipeException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testEditRecipeWithCoffeeError9() {
		try{
			CoffeeMaker coffeeMaker13a= new CoffeeMaker();
			//Set up for r1
			recipe1 = new Recipe();
			recipe1.setName("Coffee");
			recipe1.setAmtChocolate("0");
			recipe1.setAmtCoffee("3");
			recipe1.setAmtMilk("1");
			recipe1.setAmtSugar("1");
			recipe1.setPrice("50");
			coffeeMaker13a.addRecipe(recipe1);

			//Set up for r2
			recipe2 = new Recipe();
			recipe2.setName("Mocha");
			recipe2.setAmtChocolate("2");
			recipe2.setAmtCoffee("3");
			recipe2.setAmtMilk("1");
			recipe2.setAmtSugar("1");
			recipe2.setPrice("75");
			coffeeMaker13a.addRecipe(recipe2);

			//Set up for r3
			recipe3 = new Recipe();
			recipe3.setAmtChocolate("3");
			recipe3.setAmtCoffee("-3");
			recipe3.setAmtMilk("5");
			recipe3.setAmtSugar("1");
			recipe3.setPrice("100");

			coffeeMaker13a.editRecipe(1,recipe3);
		}
		catch (RecipeException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testEditRecipeWithCoffeeError10() {
		try{
			CoffeeMaker coffeeMaker13a= new CoffeeMaker();
			//Set up for r1
			recipe1 = new Recipe();
			recipe1.setName("Coffee");
			recipe1.setAmtChocolate("0");
			recipe1.setAmtCoffee("3");
			recipe1.setAmtMilk("1");
			recipe1.setAmtSugar("1");
			recipe1.setPrice("50");
			coffeeMaker13a.addRecipe(recipe1);

			//Set up for r2
			recipe2 = new Recipe();
			recipe2.setName("Mocha");
			recipe2.setAmtChocolate("2");
			recipe2.setAmtCoffee("3");
			recipe2.setAmtMilk("1");
			recipe2.setAmtSugar("1");
			recipe2.setPrice("75");
			coffeeMaker13a.addRecipe(recipe2);

			//Set up for r3
			recipe3 = new Recipe();
			recipe3.setAmtChocolate("3");
			recipe3.setAmtCoffee("abc");
			recipe3.setAmtMilk("5");
			recipe3.setAmtSugar("1");
			recipe3.setPrice("100");

			coffeeMaker13a.editRecipe(1,recipe3);
		}
		catch (RecipeException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testEditRecipeWithChocolateError11() {
		try{
			CoffeeMaker coffeeMaker13a= new CoffeeMaker();
			//Set up for r1
			recipe1 = new Recipe();
			recipe1.setName("Coffee");
			recipe1.setAmtChocolate("0");
			recipe1.setAmtCoffee("3");
			recipe1.setAmtMilk("1");
			recipe1.setAmtSugar("1");
			recipe1.setPrice("50");
			coffeeMaker13a.addRecipe(recipe1);

			//Set up for r2
			recipe2 = new Recipe();
			recipe2.setName("Mocha");
			recipe2.setAmtChocolate("2");
			recipe2.setAmtCoffee("3");
			recipe2.setAmtMilk("1");
			recipe2.setAmtSugar("1");
			recipe2.setPrice("75");
			coffeeMaker13a.addRecipe(recipe2);

			//Set up for r3
			recipe3 = new Recipe();
			recipe3.setAmtChocolate("-3");
			recipe3.setAmtCoffee("3");
			recipe3.setAmtMilk("5");
			recipe3.setAmtSugar("1");
			recipe3.setPrice("100");

			coffeeMaker13a.editRecipe(1,recipe3);
		}
		catch (RecipeException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}

	@Test
	public void testEditRecipeWithChocolateError12() {
		try{
			CoffeeMaker coffeeMaker13a= new CoffeeMaker();
			//Set up for r1
			recipe1 = new Recipe();
			recipe1.setName("Coffee");
			recipe1.setAmtChocolate("0");
			recipe1.setAmtCoffee("3");
			recipe1.setAmtMilk("1");
			recipe1.setAmtSugar("1");
			recipe1.setPrice("50");
			coffeeMaker13a.addRecipe(recipe1);

			//Set up for r2
			recipe2 = new Recipe();
			recipe2.setName("Mocha");
			recipe2.setAmtChocolate("2");
			recipe2.setAmtCoffee("3");
			recipe2.setAmtMilk("1");
			recipe2.setAmtSugar("1");
			recipe2.setPrice("75");
			coffeeMaker13a.addRecipe(recipe2);

			//Set up for r3
			recipe3 = new Recipe();
			recipe3.setAmtChocolate("abc");
			recipe3.setAmtCoffee("3");
			recipe3.setAmtMilk("5");
			recipe3.setAmtSugar("-1");
			recipe3.setPrice("100");

			coffeeMaker13a.editRecipe(1,recipe3);
		}
		catch (RecipeException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.fail();
	}


	/**
	 * Given a coffee maker with default inventory
	 *  where each ingredients is 15.
	 * When we try to set new value for ingredient
	 *   and it's either less than zero
	 * or alphabetic value
	 * Then we get the previous value of ingredients.
	 */
	@Test
	public void testSetIngredientsCoffee1() throws InventoryException {
		Inventory inventory = new Inventory();
		inventory.setCoffee(-2);
		int coffee = inventory.getCoffee();
		Assert.assertEquals(coffee, 15);
	}

	@Test
	public void testSetIngredientsChocolate1() throws InventoryException {
		Inventory inventory = new Inventory();
		inventory.setChocolate(-5);
		int chocolate = inventory.getChocolate();
		Assert.assertEquals(chocolate,15);
	}
	@Test
	public void testSetIngredientsMilk1() throws InventoryException {
		Inventory inventory = new Inventory();
		inventory.setMilk(-12);
		int milk = inventory.getMilk();
		Assert.assertEquals(milk, 15);
	}
	@Test
	public void testSetIngredientsSugar1() throws InventoryException {
		Inventory inventory = new Inventory();
		inventory.setSugar(-6);
		int sugar = inventory.getSugar();
		Assert.assertEquals(sugar, 15);
	}

}