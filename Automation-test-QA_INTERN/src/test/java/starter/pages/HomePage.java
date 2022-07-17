package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By fieldName(){
        return By.xpath("//input[@name='name']");
    }

    private By fieldEmail(){
        return By.xpath("//input[@name='email']");
    }

    private By fieldPassword(){
        return By.xpath("//input[@type='password']");
    }

    private By checkBoxIceCream(){
        return By.xpath("//input[@type='checkbox']");
    }

    private By dropdownGender(){
        return By.xpath("//select[@id='exampleFormControlSelect1']");
    }

    private By selectGender(){
        return By.xpath("//option[text()='Female']");
    }

    private By employmentStatus(){
        return By.xpath("//input[@value='option1']");
    }

    private By fieldDate(){
        return By.xpath("//input[@type='date']");
    }

    private By submitButton(){
        return By.xpath("//input[@type='submit']");
    }

    private By succesAlert(){
        return By.xpath("//strong[text()='Success!']");
    }

    public void inputFieldName(String username){
        $(fieldName()).type(username);
    }

    public void inputFieldEmail(String email){
        $(fieldEmail()).type(email);
    }

    public void inputPassword(String password){
        $(fieldPassword()).type(password);
    }

    public void clickCheckBox(){
        $(checkBoxIceCream()).click();
    }


    public void selectDropdownForGender(){
        $(dropdownGender()).click();
        $(selectGender()).select();
    }

    public void clickEmploymentStatus(){
        $(employmentStatus()).click();
    }

    public void inputDate(String date){
        $((fieldDate())).type(date);
    }

    public void clickSubmitButton(){
        $(submitButton()).click();
    }

    public void validateResult(String alert){
        $(succesAlert()).getText().equals(alert);
    }




}
