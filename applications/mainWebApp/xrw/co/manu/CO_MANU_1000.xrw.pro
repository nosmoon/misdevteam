<?xml version="1.0" encoding="EUC-KR"?>
<!--***************************************************
// 함 수 명 :  OZ 레포트 공통팝업
// 내     용  : 레포트를 인쇄할 공통 화면을 오픈한다.
// 작 성 자 : 노상현
// 작 성 일 : 2009-05-15
***************************************************-->
<xhtml:html xmlns:xhtml="http://www.w3.org/1999/xhtml" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns="http://www.w3.org/2002/01/xforms" xmlns:ev="http://www.w3.org/2001/xml-events">
	<xhtml:head>
		<xhtml:title>- 조선일보 CIIS -</xhtml:title>
		<model id="model1">
			<!-- 인스턴스 시작-->
			<instance id="instance1">
				<root xmlns="">
					<oz_data>
					</oz_data>
				</root>
			</instance>
			<!-- 인스턴스 끝-->
			<!--************************* 각 페이지 스타트 함수 부분  시작 ****************************-->
			<script type="javascript" ev:event="xforms-ready">
				<![CDATA[

				]]>
			</script>
			<!--************************* 각 페이지 스타트 함수 부분  끝 ****************************-->
		</model>
		<!--************************* 글로벌 자바스크립트 함수 부분  시작 ****************************-->
		<!--************************* 글로벌 자바스크립트 함수 부분  끝 ****************************-->
		<script type="javascript">
			<![CDATA[]]>
		</script>
	</xhtml:head>
	<!--************************* 화면 부분 시작 ****************************-->
	<xhtml:body scroll="auto" pagewidth="1270" pageheight="770" guideline="1,1270;" style="background-color:#F9F7EC; border-left-width:4px; border-top-width:1px; margin:0; margin-left:0; margin-top:0; margin-right:0; opacity:100; ">
		<!--group id="grp_search" class="search" style="left:4px; top:4px; width:1008px; height:30px; ">
			<button id="btn_close" class="top_2" navindex="2" style="left:948px; top:5px; width:48px; height:19px; ">
				<caption>종료</caption>
				<script type="javascript" ev:event="DOMActivate">
					<![CDATA[
							window.close();
						]]>
				</script>
			</button>
		</group-->
		<!--************************* OZViewer 부분 끝 ****************************-->
		<!--************************* 화면 부분 끝 ****************************-->
		<browser id="browser1" src="http://eip.chosun.com/manual/index.jsp" FullScreen="true" style="left:0px; top:0px; width:1270px; height:770px; "/>
	</xhtml:body>
</xhtml:html>
