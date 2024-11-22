[![Android Studio version](https://img.shields.io/endpoint?url=https%3A%2F%2Fsicampus.ru%2Fgitea%2Fcore%2Fdocs%2Fraw%2Fbranch%2Fmain%2Fandroid-studio-label.json)](https://sicampus.ru/gitea/core/docs/src/branch/main/how-upload-project.md)

# Пример задания НТО

Реализуте приложение из одного экрана MainActivity, который содержит текстовое поле ввода, кнопку и текстовую метку.

При нажатии на кнопку происходит запрос на получение получение пользователя в API S-Store по id пользователя. id пользователя вводится в текстовое поле ввода.

В случае кода 200 ответат от сервера в текстовой метке дожно появится сообщение "Hello firstName", где fisrtName - имя пользователя.
В случае любого другого кода или ошибки в текстовой метке должно вывестись слово "Error".

| № | View type  | id             | Максимальное значение |
|:-:|:----------:|----------------|-----------------------|
| 0 | *TextView* | `greeting`     |                       |
| 1 | *EditText* | `user_id`      | $10^{12}$             |
| 2 |  *Button*  | `get_greeting` |                       |


*Таблица 1. Элементы пользовательского интерфейса*

| № | Тест           | Балл | Проверка                  |
|:-:|----------------|:----:|---------------------------|
| 1 | checkGet       |  1   | Проверка получения данных |
| 2 | checkErorr     |  1   | Провекра вывода ошибки    |

*Таблица 2. Критерии оценивания и тесты*