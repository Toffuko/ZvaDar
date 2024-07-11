package ru.Darya.tgBot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.Darya.tgBot.entity.Category;
import ru.Darya.tgBot.entity.Client;
import ru.Darya.tgBot.entity.Product;
import ru.Darya.tgBot.repository.CategoryRepository;
import ru.Darya.tgBot.repository.ClientRepository;
import ru.Darya.tgBot.repository.ProductRepository;

import java.math.BigDecimal;

@SpringBootTest
public class FillingTests {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Test
    void createTwoClients() {
        Client client1 = new Client();
        client1.setAddress("address1");
        client1.setFullName("fullName1");
        client1.setExternalId(1L);
        client1.setPhoneNumber("+77777777777");
        clientRepository.save(client1);

        Client client2 = new Client();
        client2.setAddress("address2");
        client2.setFullName("fullName2");
        client2.setExternalId(2L);
        client2.setPhoneNumber("+88888888888");
        clientRepository.save(client2);
    }

    @Test
    void createData() {

    //  Основные категории

        Category pizza = new Category();
        pizza.setName("Пицца");
        pizza.setParent(null);
        categoryRepository.save(pizza);

        Category rolls = new Category();
        rolls.setName("Роллы");
        rolls.setParent(null);
        categoryRepository.save(rolls);

        Category burgers = new Category();
        burgers.setName("Бургеры");
        burgers.setParent(null);
        categoryRepository.save(burgers);

        Category drinks = new Category();
        drinks.setName("Напитки");
        drinks.setParent(null);
        categoryRepository.save(drinks);

        // Пиццы

        Product pizza1 = new Product();
        pizza1.setName("Грибы и Пепперони");
        pizza1.setDescription("Пепперони, шампиньоны, моцарелла, томатный соус");
        pizza1.setCategory(pizza);
        pizza1.setPrice(BigDecimal.valueOf(339));
        productRepository.save(pizza1);

        Product pizza2 = new Product();
        pizza2.setName("Фристайло");
        pizza2.setDescription("Ветчина, картошка фри, моцарелла, соус Рэнч");
        pizza2.setCategory(pizza);
        pizza2.setPrice(BigDecimal.valueOf(359));
        productRepository.save(pizza2);

        Product pizza3 = new Product();
        pizza3.setName("Гавайская");
        pizza3.setDescription("Томатный соус, моцарелла, цыплёнок подкопченный, ананас");
        pizza3.setCategory(pizza);
        pizza3.setPrice(BigDecimal.valueOf(429));
        productRepository.save(pizza3);

        //Виды классических роллов

        Category classicRolls = new Category();
        classicRolls.setName("Классические роллы");
        classicRolls.setParent(rolls);
        categoryRepository.save(classicRolls);

        Product classicRolls1 = new Product();
        classicRolls1.setName("Филадельфия лосось");
        classicRolls1.setDescription("Состав: лосось, сыр Cremette, огурец.");
        classicRolls1.setCategory(classicRolls);
        classicRolls1.setPrice(BigDecimal.valueOf(558));
        productRepository.save(classicRolls1);

        Product classicRolls2 = new Product();
        classicRolls2.setName("Филадельфия угорь");
        classicRolls2.setDescription("Состав: угорь, сыр Cremette, огурец, унаги соус, кунжут");
        classicRolls2.setCategory(classicRolls);
        classicRolls2.setPrice(BigDecimal.valueOf(588));
        productRepository.save(classicRolls2);

        Product classicRolls3 = new Product();
        classicRolls3.setName("Ямато");
        classicRolls3.setDescription("Состав: лосось, угорь, креветка, авокадо, огурец, японский майонез, унаги соус, кунжут.");
        classicRolls3.setCategory(classicRolls);
        classicRolls3.setPrice(BigDecimal.valueOf(658));
        productRepository.save(classicRolls3);

        //Виды запеченных роллов

        Category bakedRolls = new Category();
        bakedRolls.setName("Запеченые роллы");
        bakedRolls.setParent(rolls);
        categoryRepository.save(bakedRolls);

        Product bakedRolls1 = new Product();
        bakedRolls1.setName("Запечённый с угрём");
        bakedRolls1.setDescription("Состав: угорь, сыр чеддар, омлет томаго, лук зелёный, соус сырный, соус унаги, кунжут.");
        bakedRolls1.setCategory(bakedRolls);
        bakedRolls1.setPrice(BigDecimal.valueOf(418));
        productRepository.save(bakedRolls1);

        Product bakedRolls2 = new Product();
        bakedRolls2.setName("Запечённый с креветкой");
        bakedRolls2.setDescription("Состав: креветка, сыр чеддар, лук зелёный, соус сырный, омлет тамаго.");
        bakedRolls2.setCategory(bakedRolls);
        bakedRolls2.setPrice(BigDecimal.valueOf(348));
        productRepository.save(bakedRolls2);

        Product bakedRolls3 = new Product();
        bakedRolls3.setName("Запечённый с копчёным лососем");
        bakedRolls3.setDescription("Состав: лосось х/к, сыр чеддар, лук зелёный, омлет тамаго, соус сырный.");
        bakedRolls3.setCategory(bakedRolls);
        bakedRolls3.setPrice(BigDecimal.valueOf(350));
        productRepository.save(bakedRolls3);

        //Виды сладких роллов

        Category sweetRolls = new Category();
        sweetRolls.setName("Сладкие роллы");
        sweetRolls.setParent(rolls);
        categoryRepository.save(sweetRolls);

        Product sweetRolls1 = new Product();
        sweetRolls1.setName("Молочный шоколад");
        sweetRolls1.setDescription("Сладкий ролл с бананом, киви и манго, нежным сливочным сыром с добавлением какао и кокосовой стружки, подаётся с шоколадным соусом.");
        sweetRolls1.setCategory(sweetRolls);
        sweetRolls1.setPrice(BigDecimal.valueOf(350));
        productRepository.save(sweetRolls1);

        Product sweetRolls2 = new Product();
        sweetRolls2.setName("Клубничный");
        sweetRolls2.setDescription("Сладкий ролл Клубничный - киви и банан в сладком сливочно-клубничном рисе, с клубничным сиропом.");
        sweetRolls2.setCategory(sweetRolls);
        sweetRolls2.setPrice(BigDecimal.valueOf(449));
        productRepository.save(sweetRolls2);

        Product sweetRolls3 = new Product();
        sweetRolls3.setName("Нежность");
        sweetRolls3.setDescription("Сладкий ролл Нежность - манго, киви, банан и сыр Филадельфия в сливочном рисе, обёрнут в японский яичный блинчик.");
        sweetRolls3.setCategory(sweetRolls);
        sweetRolls3.setPrice(BigDecimal.valueOf(490));
        productRepository.save(sweetRolls3);

        //Виды сетов роллов

        Category sets = new Category();
        sets.setName("Сеты роллов");
        sets.setParent(rolls);
        categoryRepository.save(sets);

        Product set1 = new Product();
        set1.setName("Там-Сям");
        set1.setDescription("Состав: филадельфия окунь/лосось, овощной чеддер/маасдам, дайкон с лососем, запечённый с окунем.");
        set1.setCategory(sets);
        set1.setPrice(BigDecimal.valueOf(1500));
        productRepository.save(set1);

        Product set2 = new Product();
        set2.setName("Дикий");
        set2.setDescription("Состав: Футомаки копченный лосось/масленная рыба, калифорния краб, панко лосось в унаги, панко лосось в спайс соусе");
        set2.setCategory(sets);
        set2.setPrice(BigDecimal.valueOf(1000));
        productRepository.save(set2);

        Product set3 = new Product();
        set3.setName("Девяток роллов");
        set3.setDescription("Состав: красный дракон лайт, ролл с крабом, ролл сэнго, ролл с копчёной курицей, ролл овощной, запечённый спайс, запечённый с лососем, запечённый с мидией, запечённый с тунцом.");
        set3.setCategory(sets);
        set3.setPrice(BigDecimal.valueOf(2000));
        productRepository.save(set3);

        //Виды классических бургеров

        Category classicBurgers = new Category();
        classicBurgers.setName("Классические бургеры");
        classicBurgers.setParent(burgers);
        categoryRepository.save(classicBurgers);

        Product classicBurgers1 = new Product();
        classicBurgers1.setName("Бургер с Курицей");
        classicBurgers1.setDescription("Булочка для бургера, куриное филе обжаренное на гриле, лист салата, свежие томаты, сыр чеддер, майонез, соус горчично-медовый.");
        classicBurgers1.setCategory(classicBurgers);
        classicBurgers1.setPrice(BigDecimal.valueOf(329));
        productRepository.save(classicBurgers1);

        Product classicBurgers2 = new Product();
        classicBurgers2.setName("Чизбургер");
        classicBurgers2.setDescription("Булочка для бургера, котлета куриная, сыр чеддер, майонез, кетчуп.");
        classicBurgers2.setCategory(classicBurgers);
        classicBurgers2.setPrice(BigDecimal.valueOf(180));
        productRepository.save(classicBurgers2);

        Product classicBurgers3 = new Product();
        classicBurgers3.setName("Гамбургер");
        classicBurgers3.setDescription("Булочка для бургера, котлета куриная, майонез, кетчуп.");
        classicBurgers3.setCategory(classicBurgers);
        classicBurgers3.setPrice(BigDecimal.valueOf(150));
        productRepository.save(classicBurgers3);

        //Виды острых бургеров

        Category spicyBurgers = new Category();
        spicyBurgers.setName("Острые бургеры");
        spicyBurgers.setParent(burgers);
        categoryRepository.save(spicyBurgers);

        Product spicyBurgers1 = new Product();
        spicyBurgers1.setName("Биг Спешиал Острый Микс");
        spicyBurgers1.setDescription("Биг Спешиал Острый Микс - это неповторимый сандвич с большим рубленым бифштексом из 100% отборной говядины на большой булочке с кунжутом. Внутри свежие овощи, сыр эмменталь, соус с дымком и специальный пряный соус из микса пикантных перцев.");
        spicyBurgers1.setCategory(spicyBurgers);
        spicyBurgers1.setPrice(BigDecimal.valueOf(319));
        productRepository.save(spicyBurgers1);

        Product spicyBurgers2 = new Product();
        spicyBurgers2.setName("Чикен Премьер Халапеньо");
        spicyBurgers2.setDescription("Чикен Премьер Халапеньо - это сочная куриная котлета в хрустящей панировке, острый перец Халапеньо, сыр Чеддер, ароматный бекон, ломтик помидора, свежий салат, специальный соус и булочка с кунжутом.");
        spicyBurgers2.setCategory(spicyBurgers);
        spicyBurgers2.setPrice(BigDecimal.valueOf(165));
        productRepository.save(spicyBurgers2);

        Product spicyBurgers3 = new Product();
        spicyBurgers3.setName("Римский Бургер");
        spicyBurgers3.setDescription("Римский Бургер - это по-итальянски вкусный бургер с сочной говяжьей котлетой, руколой, помидором, двумя ломтиками сыра эмменталь, свежим луком, пикантным соусом, и всё это на вкуснейшей сырной булочке.");
        spicyBurgers3.setCategory(spicyBurgers);
        spicyBurgers3.setPrice(BigDecimal.valueOf(270));
        productRepository.save(spicyBurgers3);

        //Виды газированных напитков

        Category carbonatedDrinks = new Category();
        carbonatedDrinks.setName("Газированные напитки");
        carbonatedDrinks.setParent(drinks);
        categoryRepository.save(carbonatedDrinks);

        Product carbonatedDrinks1 = new Product();
        carbonatedDrinks1.setName("Добрый Кола");
        carbonatedDrinks1.setDescription("Добрый Кола");
        carbonatedDrinks1.setCategory(carbonatedDrinks);
        carbonatedDrinks1.setPrice(BigDecimal.valueOf(150));
        productRepository.save(carbonatedDrinks1);

        Product carbonatedDrinks2 = new Product();
        carbonatedDrinks2.setName("Добрый Лимон Лайм");
        carbonatedDrinks2.setDescription("Добрый Лимон Лайм");
        carbonatedDrinks2.setCategory(carbonatedDrinks);
        carbonatedDrinks2.setPrice(BigDecimal.valueOf(150));
        productRepository.save(carbonatedDrinks2);

        Product carbonatedDrinks3 = new Product();
        carbonatedDrinks3.setName("Добрый Апельсин");
        carbonatedDrinks3.setDescription("Добрый Апельсин");
        carbonatedDrinks3.setCategory(carbonatedDrinks);
        carbonatedDrinks3.setPrice(BigDecimal.valueOf(150));
        productRepository.save(carbonatedDrinks3);

        //Виды энергетических напитков

        Category energyDrinks = new Category();
        energyDrinks.setName("Энергетические напитки");
        energyDrinks.setParent(drinks);
        categoryRepository.save(energyDrinks);

        Product energyDrinks1 = new Product();
        energyDrinks1.setName("Burn");
        energyDrinks1.setDescription("Burn – это источник энергии для активной жизни 24/7.");
        energyDrinks1.setCategory(energyDrinks);
        energyDrinks1.setPrice(BigDecimal.valueOf(100));
        productRepository.save(energyDrinks1);

        Product energyDrinks2 = new Product();
        energyDrinks2.setName("Red Bull");
        energyDrinks2.setDescription("Red Bull дает вам крылья");
        energyDrinks2.setCategory(energyDrinks);
        energyDrinks2.setPrice(BigDecimal.valueOf(150));
        productRepository.save(energyDrinks2);

        Product energyDrinks3 = new Product();
        energyDrinks3.setName("Monster Energy");
        energyDrinks3.setDescription("Освободи зверя");
        energyDrinks3.setCategory(energyDrinks);
        energyDrinks3.setPrice(BigDecimal.valueOf(50));
        productRepository.save(energyDrinks3);

        //Виды соков

        Category juices = new Category();
        juices.setName("Соки");
        juices.setParent(drinks);
        categoryRepository.save(juices);

        Product juice1 = new Product();
        juice1.setName("Апельсиновый");
        juice1.setDescription("Соки Рич это всегда удивительная поэзия вкусов");
        juice1.setCategory(juices);
        juice1.setPrice(BigDecimal.valueOf(100));
        productRepository.save(juice1);

        Product juice2 = new Product();
        juice2.setName("Персиковый");
        juice2.setDescription("Соки Рич это всегда удивительная поэзия вкусов");
        juice2.setCategory(juices);
        juice2.setPrice(BigDecimal.valueOf(100));
        productRepository.save(juice2);

        Product juice3 = new Product();
        juice3.setName("Ананасовый");
        juice3.setDescription("Соки Рич это всегда удивительная поэзия вкусов");
        juice3.setCategory(juices);
        juice3.setPrice(BigDecimal.valueOf(100));
        productRepository.save(juice3);

        //Другие напитки

        Category otherDrinks = new Category();
        otherDrinks.setName("Другие напитки");
        otherDrinks.setParent(drinks);
        categoryRepository.save(otherDrinks);

        Product otherDrink1 = new Product();
        otherDrink1.setName("Кофе");
        otherDrink1.setDescription("Черный кофе");
        otherDrink1.setCategory(otherDrinks);
        otherDrink1.setPrice(BigDecimal.valueOf(100));
        productRepository.save(otherDrink1);

        Product otherDrink2 = new Product();
        otherDrink2.setName("Чай");
        otherDrink2.setDescription("Черный чай");
        otherDrink2.setCategory(otherDrinks);
        otherDrink2.setPrice(BigDecimal.valueOf(100));
        productRepository.save(otherDrink2);

        Product otherDrink3 = new Product();
        otherDrink3.setName("Вода");
        otherDrink3.setDescription("Без газа");
        otherDrink3.setCategory(otherDrinks);
        otherDrink3.setPrice(BigDecimal.valueOf(100));
        productRepository.save(otherDrink3);

    }
}
