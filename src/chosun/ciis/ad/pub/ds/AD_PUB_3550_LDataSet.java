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


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3550_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_3550_LDataSet(){}
	public AD_PUB_3550_LDataSet(String errcode, String errmsg){
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
			AD_PUB_3550_LCURLISTRecord rec = new AD_PUB_3550_LCURLISTRecord();
			rec.exct_mm = Util.checkString(rset0.getString("exct_mm"));
			rec.exct_amt = Util.checkString(rset0.getString("exct_amt"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.fee_dfn = Util.checkString(rset0.getString("fee_dfn"));
			rec.easy_amt = Util.checkString(rset0.getString("easy_amt"));
			rec.mms_amt = Util.checkString(rset0.getString("mms_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.mms_fee = Util.checkString(rset0.getString("mms_fee"));
			rec.sale_fee = Util.checkString(rset0.getString("sale_fee"));
			rec.card_fee = Util.checkString(rset0.getString("card_fee"));
			rec.insur_fee = Util.checkString(rset0.getString("insur_fee"));
			rec.tot_fee = Util.checkString(rset0.getString("tot_fee"));
			rec.mod_fee = Util.checkString(rset0.getString("mod_fee"));
			rec.total = Util.checkString(rset0.getString("total"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_3550_LDataSet ds = (AD_PUB_3550_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_3550_LCURLISTRecord curlistRec = (AD_PUB_3550_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.exct_mm%>
<%= curlistRec.exct_amt%>
<%= curlistRec.fee%>
<%= curlistRec.fee_dfn%>
<%= curlistRec.easy_amt%>
<%= curlistRec.mms_amt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.mms_fee%>
<%= curlistRec.sale_fee%>
<%= curlistRec.card_fee%>
<%= curlistRec.insur_fee%>
<%= curlistRec.tot_fee%>
<%= curlistRec.mod_fee%>
<%= curlistRec.total%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jan 24 16:42:50 KST 2017 */