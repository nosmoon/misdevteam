/***************************************************************************************************
 * 파일명   : SL_L_DSTCINFOCDDataSet.java
 * 기능     : 독자정보조회-구역정보
 * 작성일자 : 2006/10/25
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sal.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
**  SP_SL_L_DSTCINFOCD
**/

public class SL_L_DSTCINFOCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dstcinfocur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_DSTCINFOCDDataSet(){}
	public SL_L_DSTCINFOCDDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SL_L_DSTCINFOCDDSTCINFOCURRecord rec = new SL_L_DSTCINFOCDDSTCINFOCURRecord();
			rec.dstccd = Util.checkString(rset0.getString("dstccd"));
			rec.dstcnm = Util.checkString(rset0.getString("dstcnm"));
			rec.teamcd = Util.checkString(rset0.getString("teamcd"));
			this.dstcinfocur.add(rec);
		}
	}

	public String dstcinfocurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_L_DSTCINFOCDDSTCINFOCURRecord rec = (SL_L_DSTCINFOCDDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String dstcinfocurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_L_DSTCINFOCDDSTCINFOCURRecord rec = (SL_L_DSTCINFOCDDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<input name=\"");
			sb.append("dstccd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String dstcinfocurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SL_L_DSTCINFOCDDSTCINFOCURRecord rec = (SL_L_DSTCINFOCDDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<input name=\"");
			sb.append("dstccd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_L_DSTCINFOCDDataSet ds = (SL_L_DSTCINFOCDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		SL_L_DSTCINFOCDDSTCINFOCURRecord dstcinfocurRec = (SL_L_DSTCINFOCDDSTCINFOCURRecord)ds.dstcinfocur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDstcinfocur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dstcinfocurRec.dstccd%>
<%= dstcinfocurRec.dstcnm%>
<%= dstcinfocurRec.teamcd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 25 15:15:22 KST 2006 */