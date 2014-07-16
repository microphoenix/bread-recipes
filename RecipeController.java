/*
 * 
 * 
 * 
 */
package jsf.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 
 *
 * @author S.M.
 */
@ManagedBean(name = "recipeTableController")
@SessionScoped
public class RecipeController implements Serializable {

    private List<Recipe> recipeList = null;
    private String ciabattaPreparation
            = "Combine half of the flour and 4g of the yeast with half the water in a bowl.  Beat it together into a thick batter. " 
            + "Oil a clean work surface and knead the dough for five minutes. " 
            + "Cover the dough with a damp tea towel and leave it to rise for at least six hours at room temperature. " 
            + "Tip the mixture into the bowl of a food mixer.  Add the remaining flour, the oil and remaining yeast and half of the remaining water." 
            + "Mix this all together in a food mixer with a dough hook attached. " 
            + "Dissolve the salt in the last of the water and gradually add this to the mixture; mixing for 6-10 minutes, or until the dough is stringy and soft. " 
            + "Tip the dough into a well-oiled litre square plastic container and put the lid on. " 
            + "Leave the dough to swell until the dough has risen three-quarters of the way up the side of the container. " 
            + "Mix equal amount of flour and semolina flour together and use this to flour the work surface. Tip the dough out onto the surface.  Split the dough into two and stretch the two pieces into shape.  " 
            + "Preheat the oven to 220C/425F/Gas 7. " 
            + "Place the dough on a baking tray floured with a mixture of flour and semolina and allow to prove again for another 30 minutes. Bake for 30 minutes. ";
    
    private String ciabattaIngredients
            = "400g/14oz strong white flour, plus extra for flouring"
            + "7g instant yeast"
            + "300ml/10fl oz water"
            + "30ml/1fl oz olive oil, plus extra for oiling"
            + "7g salt"
            + "semolina flour, for flouring";

    private String tempPreparation = "Preparation method to come...";
    private String tempIngredients = "We are looking into the ingredients...";
    private Recipe current;

    /**
     * Creates a new instance of RecipeController
     */
    public RecipeController() {
        populateRecipeList();
    }

    private void populateRecipeList() {

        if (recipeList == null) {
            System.out.println("initializng recipes list");
            recipeList = new ArrayList<Recipe>();
            recipeList.add(new Recipe("Ciabatta", ciabattaIngredients, ciabattaPreparation));
            recipeList.add(new Recipe("Swedish Lucia rolls", tempIngredients, tempPreparation));
            recipeList.add(new Recipe("Rye bread", tempIngredients, tempPreparation));
            recipeList.add(new Recipe("White bread", tempIngredients, tempPreparation));
            recipeList.add(new Recipe("Brown bread", tempIngredients, tempPreparation));
        }
    }

    public String displayRecipe(String name) {
        for (Recipe recipe : recipeList) {
            if (recipe.getName().equals(name)) {
                current = recipe;
                break;
            }
        }
        return "recipe_view";
    }

    /**
     * @return the recipeList
     */
    public List getRecipeList() {
        System.out.println("Getting the recipelist =>" + recipeList.size());
        return recipeList;
    }

    /**
     * @return the current
     */
    public Recipe getCurrent() {
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(Recipe current) {
        this.current = current;
    }
}
