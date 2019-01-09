/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.pl.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList trgtptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1510_LDataSet(){}
	public PL_BAS_1510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PL_BAS_1510_LTRGTPTCRCURRecord rec = new PL_BAS_1510_LTRGTPTCRCURRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_clsf_nm = Util.checkString(rset0.getString("dlco_clsf_nm"));
			rec.basi_yymm = Util.checkString(rset0.getString("basi_yymm"));
			rec.trgt_qty = Util.checkString(rset0.getString("trgt_qty"));
			rec.trgt_amt = Util.checkString(rset0.getString("trgt_amt"));
			this.trgtptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_BAS_1510_LDataSet ds = (PL_BAS_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.trgtptcrcur.size(); i++){
		PL_BAS_1510_LTRGTPTCRCURRecord trgtptcrcurRec = (PL_BAS_1510_LTRGTPTCRCURRecord)ds.trgtptcrcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTrgtptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= trgtptcrcurRec.medi_cd%>
<%= trgtptcrcurRec.medi_nm%>
<%= trgtptcrcurRec.dlco_clsf%>
<%= trgtptcrcurRec.dlco_clsf_nm%>
<%= trgtptcrcurRec.basi_yymm%>
<%= trgtptcrcurRec.trgt_qty%>
<%= trgtptcrcurRec.trgt_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 30 14:29:47 KST 2009 */