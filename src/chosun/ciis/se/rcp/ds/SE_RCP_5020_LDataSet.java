/***************************************************************************************************
* ���ϸ� : SE_RCP_5020_LDataSet.java
* ��� : �Ǹ�- �Աݰ��� - �������� - ���Աݸ���
* �ۼ����� : 2009-05-20
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_5020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_5020_LDataSet(){}
	public SE_RCP_5020_LDataSet(String errcode, String errmsg){
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
		this.errcode 			= Util.checkString(cstmt.getString(1));
		this.errmsg 			= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 		= (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_RCP_5020_LCURLISTRecord rec = new SE_RCP_5020_LCURLISTRecord();
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"		));
			rec.dept_nm 		= Util.checkString(rset0.getString("dept_nm"		));
			rec.part_cd 		= Util.checkString(rset0.getString("part_cd"		));
			rec.part_nm 		= Util.checkString(rset0.getString("part_nm"		));
			rec.area_cd 		= Util.checkString(rset0.getString("area_cd"		));
			rec.area_nm 		= Util.checkString(rset0.getString("area_nm"		));
			rec.bo_nm 			= Util.checkString(rset0.getString("bo_nm"			));
			rec.part_clos_yn 	= Util.checkString(rset0.getString("part_clos_yn"	));
			rec.aera_clos_yn 	= Util.checkString(rset0.getString("aera_clos_yn"	));
			rec.amt_1 			= Util.checkString(rset0.getString("amt_1"			));
			rec.amt_2 			= Util.checkString(rset0.getString("amt_2"			));
			rec.amt_3 			= Util.checkString(rset0.getString("amt_3"			));
			rec.amt_etc 		= Util.checkString(rset0.getString("amt_etc"		));
			rec.amt 			= Util.checkString(rset0.getString("amt"			));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_RCP_5020_LDataSet ds = (SE_RCP_5020_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_5020_LCURLISTRecord curlistRec = (SE_RCP_5020_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.part_clos_yn%>
<%= curlistRec.aera_clos_yn%>
<%= curlistRec.amt_1%>
<%= curlistRec.amt_2%>
<%= curlistRec.amt_3%>
<%= curlistRec.amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 20 17:02:22 KST 2009 */