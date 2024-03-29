# **Линейный поиск значения в массиве**
Данный код реализует алгоритм линейного поиска значения в массиве. Пользователь вводит размер массива и значения его элементов, а также значение, которое необходимо найти. Если значение найдено, программа выводит его индекс в массиве, иначе выводится -1.

## **Файлы**
* **'Main.java'**: основной класс, содержащий метод **'linearSearch'**, осуществляющий поиск значения в массиве, 
и метод **'main'**, запускающий программу.
* **'README.md'**: файл, который вы читаете сейчас.

## **Использование**
Введите в консоли размер массива и значения его элементов. Затем введите значение, которое необходимо найти. Программа выведет индекс найденного элемента или -1, если значение не найдено.

## **Пример**
```
Введите размер массива: 5
Введите элементы массива: 4 5 1 8 2
Введите значение, которое необходимо найти: 8
Результат поиска: 3
```

## **Описание алгоритма**
Алгоритм линейного поиска заключается в последовательном переборе всех элементов массива до тех пор, пока не будет 
найден элемент с заданным значением. Если такой элемент найден, возвращается его индекс в массиве, иначе возвращается 
-1. В данной реализации поиск осуществляется в цикле, перебирающем все элементы массива, пока не будет найден элемент 
с заданным значением.