<!DOCTYPE html>

<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Add new author</title>
</head>

<body>
<form th:action="@{'/orders/add'}" th:object="${order}" method="post">
    ID: <input type="text" th:field="*{id}"/>
    <br>
    NAME: <input type="text" th:field="*{data}"/>
    <br>
    PRICE: <input type="text" th:field="*{cost}"/>
    <br>
    <button type="submit">Save</button>
</form>
</body>
</html>
