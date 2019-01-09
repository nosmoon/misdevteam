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


package chosun.ciis.pl.cls.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.rec.*;

/**
 * 
 */


public class PL_CLS_1740_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_CLS_1740_LDataSet(){}
	public PL_CLS_1740_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			PL_CLS_1740_LPTCRLISTRecord rec = new PL_CLS_1740_LPTCRLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.gnr_qty = Util.checkString(rset0.getString("gnr_qty"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.slip_yn = Util.checkString(rset0.getString("slip_yn"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_CLS_1740_LDataSet ds = (PL_CLS_1740_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_CLS_1740_LPTCRLISTRecord ptcrlistRec = (PL_CLS_1740_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPtcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ptcrlistRec.yymm%>
<%= ptcrlistRec.gnr_qty%>
<%= ptcrlistRec.amt%>
<%= ptcrlistRec.net_sale_amt%>
<%= ptcrlistRec.slip_yn%>
<%= ptcrlistRec.incmg_dt_tm%>
<%= ptcrlistRec.slip_occr_dt%>
<%= ptcrlistRec.slip_seq%>
<%= ptcrlistRec.slip_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 31 10:54:08 KST 2017 */