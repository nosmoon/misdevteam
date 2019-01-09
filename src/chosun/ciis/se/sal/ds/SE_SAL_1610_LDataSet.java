/***************************************************************************************************
* ���ϸ� : SE_SAL_1610_LDataSet.java
* ��� : �Ǹ� - ������� - ������� - ��꼭 ����
* �ۼ����� : 2009-04-15
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


public class SE_SAL_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_1610_LDataSet(){}
	public SE_SAL_1610_LDataSet(String errcode, String errmsg){
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
			SE_SAL_1610_LCURLISTRecord rec = new SE_SAL_1610_LCURLISTRecord();
			rec.bo_cd 			= Util.checkString(rset0.getString("bo_cd"			));
			rec.bo_seq 			= Util.checkString(rset0.getString("bo_seq"			));
			rec.slip_occr_dt 	= Util.checkString(rset0.getString("slip_occr_dt"	));
			rec.slip_clsf_cd 	= Util.checkString(rset0.getString("slip_clsf_cd"	));
			rec.slip_seq 		= Util.checkString(rset0.getString("slip_seq"		));
			rec.dept_nm 		= Util.checkString(rset0.getString("dept_nm"		));
			rec.part_nm 		= Util.checkString(rset0.getString("part_nm"		));
			rec.area_nm 		= Util.checkString(rset0.getString("area_nm"		));
			rec.bo_nm 			= Util.checkString(rset0.getString("bo_nm"			));
			rec.bo_head_nm 		= Util.checkString(rset0.getString("bo_head_nm"		));
			rec.ern_be 			= Util.checkString(rset0.getString("ern_be"			));
			rec.make_dt 		= Util.checkString(rset0.getString("make_dt"		));
			rec.issu_clsf 		= Util.checkString(rset0.getString("issu_clsf"		));
			rec.ern 			= Util.checkString(rset0.getString("ern"			));
			rec.bo_cd_seq 		= Util.checkString(rset0.getString("bo_cd_seq"		));
			rec.prof_type_cd	= Util.checkString(rset0.getString("prof_type_cd"	));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SAL_1610_LDataSet ds = (SE_SAL_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_1610_LCURLISTRecord curlistRec = (SE_SAL_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.ern_be%>
<%= curlistRec.make_dt%>
<%= curlistRec.issu_clsf%>
<%= curlistRec.ern%>
<%= curlistRec.bo_cd_seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 15 10:11:29 KST 2009 */