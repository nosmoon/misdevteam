/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_1110_LDataSet(){}
	public SE_BOI_1110_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_BOI_1110_LCURLISTRecord rec = new SE_BOI_1110_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.chg_prv_area_cd = Util.checkString(rset0.getString("chg_prv_area_cd"));
			rec.chg_prv_srt_seq = Util.checkString(rset0.getString("chg_prv_srt_seq"));
			rec.chg_aft_area_cd = Util.checkString(rset0.getString("chg_aft_area_cd"));
			rec.chg_aft_srt_seq = Util.checkString(rset0.getString("chg_aft_srt_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BOI_1110_LDataSet ds = (SE_BOI_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_1110_LCURLISTRecord curlistRec = (SE_BOI_1110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.chg_prv_area_cd%>
<%= curlistRec.chg_prv_srt_seq%>
<%= curlistRec.chg_aft_area_cd%>
<%= curlistRec.chg_aft_srt_seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 31 17:04:12 KST 2009 */