# SI_lab2_131186
# Втора лабораториска вежба

### Јован Митровски, бр. на индекс 131186

### Група на код:
3

### Control Flow Graph
![fin](https://user-images.githubusercontent.com/25076272/84541196-30921100-acf7-11ea-89c3-952d774a617d.jpg)

### Цикломатска комплексност
Цикломатската комплексност на овој код е 9, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=8, па цикломатската комплексност изнесува 9.

### Тест за валидност на лозинка
    @Test
    public void test1() {
    User testUser = new User(username = "JovanMitrovski", password = "password", email = "jovce_23@hotmail.com");
    List testList = new List();
    assertEquals(SILab2.function(testUser, testList), true);
 } 
