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


public class SE_BOI_2530_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_2530_LDataSet(){}
	public SE_BOI_2530_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_BOI_2530_LCURLISTRecord rec = new SE_BOI_2530_LCURLISTRecord();
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.amt1 = Util.checkString(rset0.getString("amt1"));
			rec.amt2 = Util.checkString(rset0.getString("amt2"));
			rec.amt3 = Util.checkString(rset0.getString("amt3"));
			rec.amt4 = Util.checkString(rset0.getString("amt4"));
			rec.amt5 = Util.checkString(rset0.getString("amt5"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			rec.rmtt_dt = Util.checkString(rset0.getString("rmtt_dt"));
			rec.rmtt_plac = Util.checkString(rset0.getString("rmtt_plac"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BOI_2530_LDataSet ds = (SE_BOI_2530_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_2530_LCURLISTRecord curlistRec = (SE_BOI_2530_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.amt1%>
<%= curlistRec.amt2%>
<%= curlistRec.amt3%>
<%= curlistRec.amt4%>
<%= curlistRec.amt5%>
<%= curlistRec.rcpm_shet_no%>
<%= curlistRec.rmtt_dt%>
<%= curlistRec.rmtt_plac%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 29 11:54:40 KST 2009 */