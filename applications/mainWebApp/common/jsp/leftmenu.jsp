<%@ page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.mng.rec.*
	,	chosun.ciis.co.mng.ds.*;
	"
%>
<%
  response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // http 1.1
  response.setHeader("Pragma","No-cache"); // http 1.0
	response.setDateHeader("Expires", 0); 	
%>
<?xml version="1.0" encoding="EUC-KR"?>

<%
	RwXml rx = new RwXml();
	CO_MNG_1010_LDataSet ds = (CO_MNG_1010_LDataSet)request.getAttribute("ds");
	String closeYn = "";
	String subCloseYn = "";
	String endCloseYn = "";
%>
	<Main itemID="<%=ds.menuId%>" name="<%=ds.menuId%>">
<%
	for(int i = 0; i < ds.curlist.size(); i++) {
		CO_MNG_1010_LCURLISTRecord rec = (CO_MNG_1010_LCURLISTRecord)ds.curlist.get(i);
		if ( "1".equals(rec.menu_levl) ){
			if ( "N".equals(endCloseYn) ){
				endCloseYn = "Y";
%>				
					</Subdetail>
<%				
			}
			if ( "N".equals(subCloseYn) ){
				subCloseYn = "Y";
%>
				</detail>
<%			
			}						
			if ( "N".equals(closeYn) ){
%>
			</Sub>
<%			
			}

			closeYn = "N";
%>				
			<Sub itemID="<%=rec.menu_id%>" name="<%=rec.menu_nm%>" crud="<%=rec.exctl_catl%>" url="<%=rec.exec_url%>">
<%		
		} else if ( "2".equals(rec.menu_levl) ){
			if ( "N".equals(endCloseYn) ){
				endCloseYn = "Y";
%>				
					</Subdetail>
<%				
			}		
			if ( "N".equals(subCloseYn) ){
%>
				</detail>
<%			
			}
			subCloseYn = "N";
%>
				<detail itemID="<%=rec.menu_id%>" name="<%=rec.menu_nm%>" crud="<%=rec.exctl_catl%>" url="<%=rec.exec_url%>">
<%
		} else if ( "3".equals(rec.menu_levl) ){
			if ( "N".equals(endCloseYn) ){
				endCloseYn = "Y";
%>	
					</Subdetail>
<%				
			}		
			endCloseYn = "N";
%>
					<Subdetail itemID="<%=rec.menu_id%>" name="<%=rec.menu_nm%>" crud="<%=rec.exctl_catl%>" url="<%=rec.exec_url%>">
<%
		} else if ( "4".equals(rec.menu_levl) ){
%>
						<enddetail itemID="<%=rec.menu_id%>" name="<%=rec.menu_nm%>" crud="<%=rec.exctl_catl%>" url="<%=rec.exec_url%>"/>
<%	
		}
	} 
	if ( "N".equals(endCloseYn) ){
%>
					</Subdetail>
<%	
	}
	if ( "N".equals(subCloseYn) ){
%>
				</detail>
<%	
	}
	if ( "N".equals(closeYn) ){
%>
			</Sub>
<%	
	}
%>
	</Main>

	