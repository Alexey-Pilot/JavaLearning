package HW_2;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/*
На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
Sample Input:

2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:

Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
 */
public class Task2 {
    public static void main(String[] args) {
        String[][] recipe = oldRecipe(" ");
        String[][] alternateProd = oldRecipe(" - ");
        printArray(change(recipe, alternateProd));

    }

    public static void printArray(String[][] arr) {
        for (String[] i : arr) {
            for (String j : i) {
                System.out.printf("%s ", j);
            }
            System.out.println();
        }
    }

    public static String[] @NotNull [] oldRecipe(String div) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] res = new String[n][];
        for (int i = 0; i < n; i++) {
            String x = sc.nextLine();
            res[i] = x.split(div);
        }
        System.out.println();
        return res;
    }

    public static String[][] change(String[][] recipe, String[][] prod) {
        for (int i = 0; i < recipe.length; i++) {
            for (int j = 0; j < recipe[i].length; j++) {
                for (String[] strings : prod) {
                    if (recipe[i][j].equalsIgnoreCase(strings[0])) {
                        char[] ch = recipe[i][j].toCharArray();
                        if (Character.isUpperCase(ch[0])) {
                            char[] newCh = strings[1].toCharArray();
                            newCh[0] = Character.toUpperCase(newCh[0]);
                            recipe[i][j] = new String(newCh);
                        } else {
                            recipe[i][j] = strings[1];
                        }
                    }
                }
            }
        }
        return recipe;
    }
}
