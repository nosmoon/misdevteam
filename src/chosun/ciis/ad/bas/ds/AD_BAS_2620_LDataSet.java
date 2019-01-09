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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_2620_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList trgt = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_2620_LDataSet(){}
	public AD_BAS_2620_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AD_BAS_2620_LTRGTRecord rec = new AD_BAS_2620_LTRGTRecord();
			rec.team_nm = Util.checkString(rset0.getString("team_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.pre_trgt_amt = Util.checkString(rset0.getString("pre_trgt_amt"));
			rec.pre_pubc_amt = Util.checkString(rset0.getString("pre_pubc_amt"));
			rec.pre_achi_rate = Util.checkString(rset0.getString("pre_achi_rate"));
			rec.cur_trgt_amt = Util.checkString(rset0.getString("cur_trgt_amt"));
			rec.chrg_emp_no = Util.checkString(rset0.getString("chrg_emp_no"));
			rec.cur_pubc_amt = Util.checkString(rset0.getString("cur_pubc_amt"));
			rec.cur_achi_rate = Util.checkString(rset0.getString("cur_achi_rate"));
			rec.yy_trgt_amt = Util.checkString(rset0.getString("yy_trgt_amt"));
			rec.yy_pubc_amt = Util.checkString(rset0.getString("yy_pubc_amt"));
			rec.yy_achi_rate = Util.checkString(rset0.getString("yy_achi_rate"));
			rec.trgt_clsf = Util.checkString(rset0.getString("trgt_clsf"));
			rec.trgt_obj = Util.checkString(rset0.getString("trgt_obj"));
			rec.trgt_yymm = Util.checkString(rset0.getString("trgt_yymm"));
			this.trgt.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BAS_2620_LDataSet ds = (AD_BAS_2620_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.trgt.size(); i++){
		AD_BAS_2620_LTRGTRecord trgtRec = (AD_BAS_2620_LTRGTRecord)ds.trgt.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTrgt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= trgtRec.team_nm%>
<%= trgtRec.part_nm%>
<%= trgtRec.pre_trgt_amt%>
<%= trgtRec.pre_pubc_amt%>
<%= trgtRec.pre_achi_rate%>
<%= trgtRec.cur_trgt_amt%>
<%= trgtRec.chrg_emp_no%>
<%= trgtRec.cur_pubc_amt%>
<%= trgtRec.cur_achi_rate%>
<%= trgtRec.yy_trgt_amt%>
<%= trgtRec.yy_pubc_amt%>
<%= trgtRec.yy_achi_rate%>
<%= trgtRec.trgt_clsf%>
<%= trgtRec.trgt_obj%>
<%= trgtRec.trgt_yymm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 25 12:23:19 KST 2009 */