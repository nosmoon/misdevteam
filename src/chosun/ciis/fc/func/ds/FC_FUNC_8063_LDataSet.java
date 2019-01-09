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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8063_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_8063_LDataSet(){}
	public FC_FUNC_8063_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			FC_FUNC_8063_LCURLISTRecord rec = new FC_FUNC_8063_LCURLISTRecord();
			rec.leas_no = Util.checkString(rset2.getString("leas_no"));
			rec.pay_plan_dt = Util.checkString(rset2.getString("pay_plan_dt"));
			rec.lciyul = Util.checkString(rset2.getString("lciyul"));
			rec.frex_cd_nm = Util.checkString(rset2.getString("frex_cd_nm"));
			rec.repay_prcp = Util.checkString(rset2.getString("repay_prcp"));
			rec.repay_int = Util.checkString(rset2.getString("repay_int"));
			rec.sum_repay_prcp = Util.checkString(rset2.getString("sum_repay_prcp"));
			rec.exrate = Util.checkString(rset2.getString("exrate"));
			rec.won_amt = Util.checkString(rset2.getString("won_amt"));
			rec.libo_int_rate = Util.checkString(rset2.getString("libo_int_rate"));
			rec.dedu_int_rate = Util.checkString(rset2.getString("dedu_int_rate"));
			rec.frex_cd = Util.checkString(rset2.getString("frex_cd"));
			rec.frex_nm = Util.checkString(rset2.getString("frex_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_8063_LDataSet ds = (FC_FUNC_8063_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_8063_LCURLISTRecord curlistRec = (FC_FUNC_8063_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.leas_no%>
<%= curlistRec.pay_plan_dt%>
<%= curlistRec.lciyul%>
<%= curlistRec.frex_cd_nm%>
<%= curlistRec.repay_prcp%>
<%= curlistRec.repay_int%>
<%= curlistRec.sum_repay_prcp%>
<%= curlistRec.exrate%>
<%= curlistRec.won_amt%>
<%= curlistRec.libo_int_rate%>
<%= curlistRec.dedu_int_rate%>
<%= curlistRec.frex_cd%>
<%= curlistRec.frex_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Apr 11 13:18:30 KST 2009 */