<%
/*
 * -----------------------------------------------------------------------------
 * 파일명: index.jsp
 * 설계자: 양정녕
 * 작성자: 양정녕
 * 설명 : 로그인 페이지를 구성한다.
 * -----------------------------------------------------------------------------
 * 수정이력
 * VersionDateDescription		작성자
 *1.0.0 2008/10/27상세설계에 의거.		양정녕
 * -----------------------------------------------------------------------------
 */
%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
	response.setHeader("Pragma","No-cache"); //HTTP 1.0 
	response.setDateHeader ("Expires", 0); 
	response.setHeader ("Cache-Control", "no-cache");
%>
<html>
<head>
<title>조선일보통합정보지원시스템</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<script language="javascript">
function setl_test(){
	var n = document.myform;
	n.elements['protID'].value = "createDoc";
	n.elements['docID'].value = "100-001-20090310-001";
	n.elements['Document'].value = n.elements['samp_xml'].value;
	n.elements['Document'].value = n.elements['samp_xml'].value.replace(/\"/g, "&quot;");

	n.action = "portal3.jsp";
	n.submit();
}
</script>
</head>
<body>
	<form name="myform" action="" method="post">
	<input type="hidden" name="protID" />
	<input type="hidden" name="docID" />
	<input type="hidden" name="Document" />
	<input type="button" name="btn_test" class="b05" value="전자결재" onclick="setl_test()"/>
	<textarea name="samp_xml" cols="100" rows="30"><?xml version="1.0" encoding="EUC-KR"?> 
<exchangeableDocument>
	<documentInformation>
		<documentType>common_open_04</documentType>
		<documentID>100-001-20090310-001</documentID>
		<createTime>2006/08/18 01:12:53</createTime> 
		<modifiedTime>2006/08/18 01:12:53</modifiedTime>
		<createSystem>SAP</createSystem> 
		<createServer>10.1.10.112</createServer>
		<gccOrganizationCode></gccOrganizationCode>
		<creator>홍길동</creator>
		<subject>추가배정요청</subject>
	</documentInformation> 
	<processInformation>
		<destinationSystem>SmartFlow XF</destinationSystem>
		<recipient>gdhong</recipient> 
		<documentStatus>accepted</documentStatus>
		<workflow>
			<ExtNFSancLineInfo>
				<seqNum>0</seqNum>
				<actorType>100</actorType>
				<person>
					<id>0102</id>
					<name>김계장</name>
					<deptID>dev0</deptID>
					<deptName>교육0과</deptName>
					<parentOrgID>archiveTest</parentOrgID>
					<parentOrgName>나눔기술</parentOrgName>
					<rank>계장</rank>
					<role>계장</role>
					<caste>관리자</caste>
				</person>
				<kind>기안</kind>
				<notProcessReason></notProcessReason>
				<status>기안</status>
				<arrivedTime>2007/02/26 14:25:00</arrivedTime>
				<readTime>2007/02/26 14:25:00</readTime>
				<processedTime>2007/02/26 14:25:00</processedTime>
				<comment></comment>
			</ExtNFSancLineInfo>
			<ExtNFSancLineInfo>
				<seqNum>1</seqNum>
				<actorType>100</actorType>
				<person>
					<id>0103</id>
					<name>김사원</name>
					<deptID>dev0</deptID>
					<deptName>교육0과</deptName>
					<parentOrgID>archiveTest</parentOrgID>
					<parentOrgName>나눔기술</parentOrgName>
					<rank>담당</rank>
					<role>담당</role>
					<caste>관리자</caste>
				</person>
				<kind>검토</kind>
				<notProcessReason></notProcessReason>
				<status>미결</status>
				<arrivedTime>2007/02/26 14:25:00</arrivedTime>
				<readTime></readTime>
				<processedTime></processedTime>
				<comment></comment>
			</ExtNFSancLineInfo>
			<ExtNFSancLineInfo>
				<seqNum>2</seqNum>
				<actorType>100</actorType>
				<person>
					<id>0101</id>
					<name>김과장</name>
					<deptID>dev0</deptID>
					<deptName>교육0과</deptName>
					<parentOrgID>archiveTest</parentOrgID>
					<parentOrgName>나눔기술</parentOrgName>
					<rank>과장</rank>
					<role>과장</role>
					<caste>관리자</caste>
				</person>
				<kind>결재</kind>
				<notProcessReason></notProcessReason>
				<status></status>
				<arrivedTime>2007/02/26 14:25:00</arrivedTime>
				<readTime></readTime>
				<processedTime></processedTime>
				<comment></comment>
			</ExtNFSancLineInfo>
			<doc_num>전략기획과-12345</doc_num>
		</workflow>
	</processInformation>
	<documentDescription>
		<work>
			<work_manage>
				<job_name></job_name>
				<start_date></start_date> 
				<open_term></open_term>
				<dept_name></dept_name>
				<district_name></district_name> 
			</work_manage>
			<work_ref></work_ref> 
			<work_item work_item_code ="001" work_item_name ="신청부서">총괄지원팀</work_item>
			<work_item work_item_code ="002" work_item_name ="신청인">장길산</work_item>
			<work_item work_item_code ="003" work_item_name ="신청액">4,900,000</work_item>
		</work>
	</documentDescription> 
	<documentBody>
		<business>
			<biz_name></biz_name> 
		</business> 
		<process>
			<proc_name></proc_name>
			<ins_date></ins_date> 
			<dept_name></dept_name>
			<chg_resno></chg_resno>
			<chg_name></chg_name> 
			<chg_phone></chg_phone>
			<chg_email></chg_email>
			<proc_content></proc_content>
		</process>
</documentBody> 
	<attachments> 
		<file>
			<seq>1</seq> 
			<name>요청근거.gul</name>
			<url>http://41.0.0.5:8090/file/request.gul</url> 
		</file>
		<file>
			<seq>2</seq> 
			<name>요청부서.xls</name>
			<url>http://41.0.0.5:8090/file/requestpart.xls</url>
		</file>
	</attachments>
</exchangeableDocument>
</textarea>
	</form>
</body>
</html>