<!DOCTYPE html>
<html>
<head lang="en">
<title>Spring Boot Demo - FreeMarker</title>
<link href="/css/index.css" rel="stylesheet">
<script type="text/javascript" src="/js/jquery.js"></script>
<script type="text/javascript" src="/js/index.js"></script>
</head>
<body>
    <h2>Ê×Ò³<h2>
    
    <font> 
        <#list userList as item> 
            ${item!}<br />
        </#list>
    </font>
    
    <button class="a"> click me</button>
</body>
</html>