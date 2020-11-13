<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!-- Include header -->
<jsp:include page="WEB-INF/includes/header.jsp" flush="true"/>

<!-- Insert title -->
<title>Template: Home</title>

<body class="d-flex flex-column h-100 text-center bg-light">

<!-- Include navbar -->
<jsp:include page="WEB-INF/includes/navbar.jsp" flush="true"/>

<main role="main" class="container flex-shrink-0">
    <h1>Resterende Template!</h1>
    <a href="Main?target=test&destination=test">To test</a>
</main>

<!-- Include footer -->
<jsp:include page="WEB-INF/includes/footer.jsp" flush="true"/>
</body>
</html>