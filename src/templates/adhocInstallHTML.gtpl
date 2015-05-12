<!doctype html>
<!--
    Copyright (c) 2010-2015, M. Sean Gilligan
    Licensed under the MIT License (see MIT-License-Build-Scripts.txt)
-->
<html>
	<head>
		<title>Install ${BASENAME} ${CONFIG} ${VERSION}</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0"/>
		<link rel="stylesheet" href="style/style.css" type="text/css" />
	</head>
	<body>
		<div class="toolbar">
			<h1 id="pageTitle">${BASENAME}</h1>
			<a id="backButton" class="button" href="#"></a>
		</div>
    <div class="navroot">
      <div id="home" class="panel" shown="true">
        <h2 style="text-align: center">Over-the-air Install</h2>
        <a class="whiteButton" type="button" style="float: none; width: auto; padding-top: 100px; border: none" href="itms-services://?action=download-manifest&amp;url=${BASESSLURL}/${RELEASEID}.plist">
            Install ${BASENAME} ${VERSION}</a>
      </div>
    </div>
	</body>
</html>
