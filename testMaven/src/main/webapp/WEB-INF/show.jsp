<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#province").change(function() {
			//	location.href = "change.do?pId="+$(this).val();
			$.ajax({
				url : "change2.do",
				type : "post",
				data : {
					pId : $(this).val()
				},

				//	resultType : "text",
				resultType : "json",
				success : function(data) {
var html="";
					for (var i = 0; i < data.length; i++) {
   html+="<option value="+data[i].id+">"+data[i].name+"</option>"
					}
$("#city").html(html);
				}

			})
		})

	})
</script>
</head>
<body>

	省份：
	<select id="province">
		<c:forEach items="${pros}" var="p">
			<option value="${p.id }" <c:if test="${pId==p.id}">selected</c:if>>${p.name }</option>

		</c:forEach>

	</select> 城市：
	<select id="city">
		<c:forEach items="${citys}" var="c">
			<option value="${c.id }">${c.name }</option>

		</c:forEach>
	</select>


</body>
</html>