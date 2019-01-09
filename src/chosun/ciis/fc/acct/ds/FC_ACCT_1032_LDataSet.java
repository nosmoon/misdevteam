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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1032_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_1032_LDataSet(){}
	public FC_ACCT_1032_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_1032_LCURLISTRecord rec = new FC_ACCT_1032_LCURLISTRecord();
			rec.mang_item_cd = Util.checkString(rset0.getString("mang_item_cd"));
			rec.mang_item_cdnm = Util.checkString(rset0.getString("mang_item_cdnm"));
			rec.prty_rank = Util.checkString(rset0.getString("prty_rank"));
			rec.bal_mang_clsf = Util.checkString(rset0.getString("bal_mang_clsf"));
			rec.drcr_clsf = Util.checkString(rset0.getString("drcr_clsf"));
			rec.mand_reg_yn = Util.checkString(rset0.getString("mand_reg_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_1032_LDataSet ds = (FC_ACCT_1032_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_1032_LCURLISTRecord curlistRec = (FC_ACCT_1032_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.mang_item_cd%>
<%= curlistRec.mang_item_cdnm%>
<%= curlistRec.prty_rank%>
<%= curlistRec.bal_mang_clsf%>
<%= curlistRec.drcr_clsf%>
<%= curlistRec.mand_reg_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 27 17:43:58 KST 2009 */