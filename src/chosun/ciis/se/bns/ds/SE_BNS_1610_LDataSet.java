/***************************************************************************************************
* ���ϸ� : SE_BNS_1610_LDataSet.java
* ��� : �Ǹ�-���˹����� - ���˹�����ó��
* �ۼ����� : 2009-04-29
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BNS_1610_LDataSet(){}
	public SE_BNS_1610_LDataSet(String errcode, String errmsg){
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
		this.errcode 				= Util.checkString(cstmt.getString(1));
		this.errmsg 				= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 			= (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_BNS_1610_LCURLISTRecord rec = new SE_BNS_1610_LCURLISTRecord();
			rec.dept_cd 			= Util.checkString(rset0.getString("dept_cd"			));
			rec.dept_nm 			= Util.checkString(rset0.getString("dept_nm"			));
			rec.part_cd 			= Util.checkString(rset0.getString("part_cd"			));
			rec.part_nm 			= Util.checkString(rset0.getString("part_nm"			));
			rec.area_cd 			= Util.checkString(rset0.getString("area_cd"			));
			rec.area_nm 			= Util.checkString(rset0.getString("area_nm"			));
			rec.bo_cd 				= Util.checkString(rset0.getString("bo_cd"				));
			rec.bo_seq 				= Util.checkString(rset0.getString("bo_seq"				));
			rec.bo_nm 				= Util.checkString(rset0.getString("bo_nm"				));
			rec.bo_head_nm 			= Util.checkString(rset0.getString("bo_head_nm"			));
			rec.ewh_seq 			= Util.checkString(rset0.getString("ewh_seq"			));
			rec.uprc 				= Util.checkString(rset0.getString("uprc"				));
			rec.divn_uprc 			= Util.checkString(rset0.getString("divn_uprc"			));
			rec.qunt				= Util.checkString(rset0.getString("qunt"				));
			rec.compen_divn_amt 	= Util.checkString(rset0.getString("compen_divn_amt"	));
			rec.nocompen_divn_amt	= Util.checkString(rset0.getString("nocompen_divn_amt"	));
			rec.divn_dt 			= Util.checkString(rset0.getString("divn_dt"			));
			rec.bns_item_cd			= Util.checkString(rset0.getString("bns_item_cd"		));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BNS_1610_LDataSet ds = (SE_BNS_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BNS_1610_LCURLISTRecord curlistRec = (SE_BNS_1610_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.ewh_seq%>
<%= curlistRec.uprc%>
<%= curlistRec.divn_uprc%>
<%= curlistRec.compen_divn_amt%>
<%= curlistRec.nocompen_divn_amt%>
<%= curlistRec.divn_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 29 18:09:32 KST 2009 */