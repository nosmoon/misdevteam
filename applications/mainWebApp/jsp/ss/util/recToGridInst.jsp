<%@ page contentType="text/xml; charset=EUC-KR" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%@ page import="java.lang.reflect.Field"%>

<%
	String recClassName = request.getParameter("recClassName");
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int recToGridInst = rxw.add(root, "recToGridInst", "");
	
	if(recClassName != null && !recClassName.trim().equals(""))
	{
		Field[] flds = Class.forName(recClassName).getFields();
		if(flds!=null && flds.length>0)
		{
			int grid = rxw.add(recToGridInst, "grid", "");
			int record = rxw.add(grid, "record", "");
			for(int i=0; flds!=null && i<flds.length; i++)
			{
				rxw.add(record, flds[i].getName(), ""); 
			}
		}
	}
	
	rxw.flush(out);
%>