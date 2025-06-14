package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement aboutLink=
            $(By.xpath("//span[contains(text(),'О нас')]"));
    private final SelenideElement technologiesLink=
            $(By.xpath("//span[contains(text(), 'Технологии и решения')]"));
    private final SelenideElement publicationsLink=
            $(By.xpath("//span[contains(text(), 'Публикации')]"));
    private final SelenideElement searchFieldLink =
            $(By.xpath("//input[@placeholder='Поиск']"));

    public static MainPage openPage() {
        open("https://x5.tech");
        return new MainPage();
    }

    public MainPage mainStructureElementsExist (){
        $("div#page").shouldBe();
        $("div.overflow-x-clip").shouldBe(exist);
        return this;
    }

    public MainPage clickAboutUs() {
        aboutLink.click();
        return this;
    }
    public MainPage clickPublications() {
        publicationsLink.click();
        return this;
    }
    public MainPage clickTechnologies() {
        technologiesLink.click();
        return this;
    }
    public MainPage clickSearch() {
        searchFieldLink.click();
        return this;
    }

}
