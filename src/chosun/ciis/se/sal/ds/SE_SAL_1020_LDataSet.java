/***************************************************************************************************
* ���ϸ� : SE_SAL_1020_LDataSet.java
* ��� : �Ǹ� - ������� - ������� - �����������������
* �ۼ����� : 2009-04-09
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_1020_LDataSet(){}
	public SE_SAL_1020_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 		= (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_SAL_1020_LCURLISTRecord rec = new SE_SAL_1020_LCURLISTRecord();
			rec.yymm 			= Util.checkString(rset0.getString("yymm"			));
			rec.supr_dept_cd 	= Util.checkString(rset0.getString("supr_dept_cd"	));
			rec.supr_dept_nm 	= Util.checkString(rset0.getString("supr_dept_nm"	));
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"		));
			rec.dept_nm 		= Util.checkString(rset0.getString("dept_nm"		));
			rec.sido_cd 		= Util.checkString(rset0.getString("sido_cd"		));
			rec.sido_nm 		= Util.checkString(rset0.getString("sido_nm"		));
			rec.area_cd 		= Util.checkString(rset0.getString("area_cd"		));
			rec.area_nm 		= Util.checkString(rset0.getString("area_nm"		));
			rec.chrg_pers 		= Util.checkString(rset0.getString("chrg_pers"		));
			rec.flnm 			= Util.checkString(rset0.getString("flnm"			));
			rec.gubun 			= Util.checkString(rset0.getString("gubun"			));
			rec.crte_yn 		= Util.checkString(rset0.getString("crte_yn"		));
			rec.hdpt_cd 		= Util.checkString(rset0.getString("hdpt_cd"		));
			rec.step 			= Util.checkString(rset0.getString("step"			));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SAL_1020_LDataSet ds = (SE_SAL_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_1020_LCURLISTRecord curlistRec = (SE_SAL_1020_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.supr_dept_cd%>
<%= curlistRec.supr_dept_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.sido_cd%>
<%= curlistRec.sido_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.flnm%>
<%= curlistRec.gubun%>
<%= curlistRec.crte_yn%>
<%= curlistRec.hdpt_cd%>
<%= curlistRec.step%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 09 11:38:05 KST 2009 */