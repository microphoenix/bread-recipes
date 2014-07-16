/*
 * 
 * 
 * 
 */

package jsf.beans;

/**
*
* Class Recipe; holds individual recipes
*/
public class Recipe implements java.io.Serializable {

    private String name;
    private String ingredients;
    private String preparation;

    public Recipe() {
        this.name = null;
        this.ingredients = null;
        this.preparation = null;
    }

    public Recipe(String name, String ingredients, String preparation) {
        this.name = name;
        this.ingredients = ingredients;
        this.preparation = preparation;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ingredients
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * @return the preparation
     */
    public String getPreparation() {
        return preparation;
    }

    /**
     * @param preparation the preparation to set
     */
    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }
}
