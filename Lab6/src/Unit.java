
public class Unit
{
    public static int numberOfLetter(String text, char letter) //Статичен метод numberOfLetter. Този метод проверява колко пъти се среща буквата letter в текста text                                                                //Методът получава като параметри текстът който ще се обходи и буква letter, която ще се проверява колко пъти се среще в текста 
    {
        int counter = 0;                                        //Променлива която ще следи колко пъти се среща буквата в текста
        for(int i = 0; i < text.length(); i++) //-------------->Минаване през всички елементи в масива(Текста е масив от символи)
        {
            char curentLetter = text.charAt(i);                    //Вземане на конкретната буква чрез метод charAt()
            if(curentLetter == letter) 
            {                        //сравняване на двете букви ако са равни имаме съвпадение
                counter++;
            }
        }
        return counter;
    }
}



