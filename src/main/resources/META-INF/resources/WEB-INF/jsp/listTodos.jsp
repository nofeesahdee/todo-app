<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    List Todos
    <table>
        <thead>
            <tr>
                <th>id</th>
                <th>Description</th>
                <th>Target</th>
                <th>Is Done?</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todos">
                <tr>
                    <td>${todos.id}</td>
                    <td>${todos.description}</td>
                    <td>${todos.targetDate}</td>
                    <td>${todos.done}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="add-todo">Add Todos</a>
</body>
</html>