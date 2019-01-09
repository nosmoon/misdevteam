/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.trg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1630_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_TRG_1630_LDataSet(){}
	public SE_TRG_1630_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_TRG_1630_LCURLISTRecord rec = new SE_TRG_1630_LCURLISTRecord();
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.chrg_flnm = Util.checkString(rset0.getString("chrg_flnm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.trgt = Util.checkString(rset0.getString("trgt"));
			rec.tot_rslt = Util.checkString(rset0.getString("tot_rslt"));
			rec.ufth_dedu = Util.checkString(rset0.getString("ufth_dedu"));
			rec.camp_dedu = Util.checkString(rset0.getString("camp_dedu"));
			rec.re_free_dedu = Util.checkString(rset0.getString("re_free_dedu"));
			rec.exst_rdr_dedu = Util.checkString(rset0.getString("exst_rdr_dedu"));
			rec.rslt = Util.checkString(rset0.getString("rslt"));
			rec.scor = Util.checkString(rset0.getString("scor"));
			rec.std_scor = Util.checkString(rset0.getString("std_scor"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_TRG_1630_LDataSet ds = (SE_TRG_1630_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_TRG_1630_LCURLISTRecord curlistRec = (SE_TRG_1630_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.area_nm%>
<%= curlistRec.chrg_flnm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.trgt%>
<%= curlistRec.tot_rslt%>
<%= curlistRec.ufth_dedu%>
<%= curlistRec.camp_dedu%>
<%= curlistRec.re_free_dedu%>
<%= curlistRec.exst_rdr_dedu%>
<%= curlistRec.rslt%>
<%= curlistRec.scor%>
<%= curlistRec.std_scor%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 06 15:30:54 KST 2009 */