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


package chosun.ciis.hd.dalon.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_1050_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DALON_1050_LDataSet(){}
	public HD_DALON_1050_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(4);
		while(rset2.next()){
			HD_DALON_1050_LCURLISTRecord rec = new HD_DALON_1050_LCURLISTRecord();
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.prvdd_prsnt_tm_prv = Util.checkString(rset2.getString("prvdd_prsnt_tm_prv"));
			rec.finish_dd_clsf = Util.checkString(rset2.getString("finish_dd_clsf"));
			rec.prvdd_finish_tm_aft = Util.checkString(rset2.getString("prvdd_finish_tm_aft"));
			rec.prvdd_finish_tm_prv = Util.checkString(rset2.getString("prvdd_finish_tm_prv"));
			rec.thdd_prsnt_tm_aft = Util.checkString(rset2.getString("thdd_prsnt_tm_aft"));
			rec.thdd_prsnt_tm_prv = Util.checkString(rset2.getString("thdd_prsnt_tm_prv"));
			rec.pay_amt = Util.checkString(rset2.getString("pay_amt"));
			rec.prsnt_hody_clsf = Util.checkString(rset2.getString("prsnt_hody_clsf"));
			rec.finish_hody_clsf = Util.checkString(rset2.getString("finish_hody_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_DALON_1050_LDataSet ds = (HD_DALON_1050_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DALON_1050_LCURLISTRecord curlistRec = (HD_DALON_1050_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seq%>
<%= curlistRec.prvdd_prsnt_tm_prv%>
<%= curlistRec.finish_dd_clsf%>
<%= curlistRec.prvdd_finish_tm_aft%>
<%= curlistRec.prvdd_finish_tm_prv%>
<%= curlistRec.thdd_prsnt_tm_aft%>
<%= curlistRec.thdd_prsnt_tm_prv%>
<%= curlistRec.pay_amt%>
<%= curlistRec.prsnt_hody_clsf%>
<%= curlistRec.finish_hody_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 12 11:22:36 KST 2018 */