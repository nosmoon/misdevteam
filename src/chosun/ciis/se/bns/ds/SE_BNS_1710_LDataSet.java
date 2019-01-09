/***************************************************************************************************
* ���ϸ� : SE_BNS_1710_LDataSet.java
* ��� : �Ǹ�-���˹����� - ���˹������Ȳ��ȸ
* �ۼ����� : 2009-05-04
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


public class SE_BNS_1710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BNS_1710_LDataSet(){}
	public SE_BNS_1710_LDataSet(String errcode, String errmsg){
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
			SE_BNS_1710_LCURLISTRecord rec = new SE_BNS_1710_LCURLISTRecord();
			rec.bns_item_cd 	= Util.checkString(rset0.getString("bns_item_cd"	));
			rec.bns_item_nm 	= Util.checkString(rset0.getString("bns_item_nm"	));
			rec.bo_cd 			= Util.checkString(rset0.getString("bo_cd"			));
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"		));
			rec.dept_nm 		= Util.checkString(rset0.getString("dept_nm"		));
			rec.part_cd 		= Util.checkString(rset0.getString("part_cd"		));
			rec.part_nm 		= Util.checkString(rset0.getString("part_nm"		));
			rec.area_cd 		= Util.checkString(rset0.getString("area_cd"		));
			rec.area_nm 		= Util.checkString(rset0.getString("area_nm"		));
			rec.bo_nm 			= Util.checkString(rset0.getString("bo_nm"			));
			rec.in_tot_qunt 	= Util.checkString(rset0.getString("in_tot_qunt"	));
			rec.divn_tot_qunt 	= Util.checkString(rset0.getString("divn_tot_qunt"	));
			rec.uprc 			= Util.checkString(rset0.getString("uprc"			));
			rec.divn_uprc 		= Util.checkString(rset0.getString("divn_uprc"		));
			rec.divn_dt 		= Util.checkString(rset0.getString("divn_dt"		));
			rec.qunt 			= Util.checkString(rset0.getString("qunt"			));
			rec.un_divn_qunt 	= Util.checkString(rset0.getString("un_divn_qunt"	));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BNS_1710_LDataSet ds = (SE_BNS_1710_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BNS_1710_LCURLISTRecord curlistRec = (SE_BNS_1710_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.bns_item_cd%>
<%= curlistRec.bns_item_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.in_tot_qunt%>
<%= curlistRec.divn_tot_qunt%>
<%= curlistRec.uprc%>
<%= curlistRec.divn_uprc%>
<%= curlistRec.divn_dt%>
<%= curlistRec.qunt%>
<%= curlistRec.un_divn_qunt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 04 14:08:41 KST 2009 */