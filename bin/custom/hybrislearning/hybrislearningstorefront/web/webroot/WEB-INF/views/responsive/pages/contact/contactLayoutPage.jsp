<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
 
<spring:htmlEscape defaultHtmlEscape="true" />
 
<template:page pageTitle="${pageTitle}">
 
    <h3>This is my contact page</h3>

	<cms:pageSlot position="youtubeVideo" var="feature" element="div" class="your-class">
	    <cms:component component="${feature}" />
	</cms:pageSlot>
 
</template:page>