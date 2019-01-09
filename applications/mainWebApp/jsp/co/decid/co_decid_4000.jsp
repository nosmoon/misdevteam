<%@	page contentType="text/xml; charset=EUC-KR" %>

<%
		out.write("<root>");
		out.write("<tempData>");
		out.write("<exchangeableDocument>");
		out.write("<documentInformation>");
		out.write("<documentType></documentType>");
		out.write("<documentID></documentID>");
		out.write("<createTime></createTime>");
		out.write("<modifiedTime></modifiedTime>");
		out.write("<createSystem></createSystem>");
		out.write("<createServer></createServer>");
		out.write("<gccOrganizationCode></gccOrganizationCode>");
		out.write("<creator></creator>");
		out.write("<subject></subject>");
		out.write("</documentInformation>");
		out.write("<processInformation>");
		out.write("<destinationSystem></destinationSystem>");
		out.write("<recipient></recipient>");
		out.write("<documentStatus></documentStatus>");
		out.write("<workflow>");
		out.write("</workflow>");
		out.write("</processInformation>");
		out.write("<documentDescription>");
		out.write("<work>");
		out.write("<work_manage>");
		out.write("<job_name></job_name>");
		out.write("<start_date></start_date>");
		out.write("<open_term></open_term>");
		out.write("<dept_name></dept_name>");
		out.write("<district_name></district_name>");
		out.write("</work_manage>");
		out.write("<work_ref></work_ref>");
		out.write("</work>");
		out.write("</documentDescription>");
		out.write("<documentBody>");
		out.write("<business>");
		out.write("<biz_name />");
		out.write("</business>");
		out.write("<process>");
		out.write("<proc_name />");
		out.write("<ins_date />");
		out.write("<dept_name />");
		out.write("<chg_resno />");
		out.write("<chg_name />");
		out.write("<chg_phone />");
		out.write("<chg_email />");
		out.write("<proc_content />");
		out.write("</process>");
		out.write("</documentBody>");
		out.write("<attachments>");
		out.write("</attachments>");
		out.write("</exchangeableDocument>");
		out.write("</tempData>");
		out.write("</root>");
		
%>