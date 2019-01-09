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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_2510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_2510_LDataSet(){}
	public SP_SAL_2510_LDataSet(String errcode, String errmsg){
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
			SP_SAL_2510_LCURLIST1Record rec = new SP_SAL_2510_LCURLIST1Record();
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.sale_yymm = Util.checkString(rset0.getString("sale_yymm"));
			rec.clam = Util.checkString(rset0.getString("clam"));
			rec.clam_amt = Util.checkString(rset0.getString("clam_amt"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.card_qunt = Util.checkString(rset0.getString("card_qunt"));
			rec.card_coms = Util.checkString(rset0.getString("card_coms"));
			rec.card_amt = Util.checkString(rset0.getString("card_amt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SP_SAL_2510_LDataSet ds = (SP_SAL_2510_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SP_SAL_2510_LCURLIST1Record curlist1Rec = (SP_SAL_2510_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.sale_yymm%>
<%= curlist1Rec.clam%>
<%= curlist1Rec.clam_amt%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.amt%>
<%= curlist1Rec.card_qunt%>
<%= curlist1Rec.card_coms%>
<%= curlist1Rec.card_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 16 16:37:48 KST 2012 */