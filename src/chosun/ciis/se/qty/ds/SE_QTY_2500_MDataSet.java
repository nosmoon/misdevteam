/***************************************************************************************************
* ���ϸ� : SE_QTY_2500_MDataSet.java
* ��� : �μ����� - �߼ۺμ� - �뼱���߼ۺμ���Ȳ
* �ۼ����� : 2009-03-06
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2500_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList arealist 	= new ArrayList();
	public ArrayList curlist 	= new ArrayList();
	public String errcode	;
	public String errmsg	;

	public SE_QTY_2500_MDataSet(){}
	public SE_QTY_2500_MDataSet(String errcode, String errmsg){
		this.errcode 	= errcode	;
		this.errmsg 	= errmsg	;
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
		this.errcode 		= Util.checkString(cstmt.getString(1));
		this.errmsg 		= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 	= (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_QTY_2500_MCURLISTRecord rec = new SE_QTY_2500_MCURLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.curlist.add(rec);
		}
		ResultSet rset1 	= (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_QTY_2500_MAREALISTRecord rec = new SE_QTY_2500_MAREALISTRecord();
			rec.area_cd 	= Util.checkString(rset1.getString("area_cd"	));
			rec.area_nm 	= Util.checkString(rset1.getString("area_nm"	));
			this.arealist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_QTY_2500_MDataSet ds = (SE_QTY_2500_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_2500_MCURLISTRecord curlistRec = (SE_QTY_2500_MCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SE_QTY_2500_MAREALISTRecord arealistRec = (SE_QTY_2500_MAREALISTRecord)ds.arealist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getArealist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 06 10:36:50 KST 2009 */