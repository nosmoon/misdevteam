/***************************************************************************************************
* ���ϸ� : SE_SND_2430_LDataSet.java
* ��� : �Ǹ�-�߼۰���-���۴ܰ�����
* �ۼ����� : 2009-02-19
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2430_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2430_LDataSet(){}
	public SE_SND_2430_LDataSet(String errcode, String errmsg){
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
			SE_SND_2430_LCURLISTRecord rec = new SE_SND_2430_LCURLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.chg_reg_dt = Util.checkString(rset0.getString("chg_reg_dt"));
			rec.chg_no = Util.checkString(rset0.getString("chg_no"));
			rec.tran_uprc_cd = Util.checkString(rset0.getString("tran_uprc_cd"));
			rec.send_yn = Util.checkString(rset0.getString("send_yn"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_2430_LDataSet ds = (SE_SND_2430_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2430_LCURLISTRecord curlistRec = (SE_SND_2430_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.chg_reg_dt%>
<%= curlistRec.chg_no%>
<%= curlistRec.tran_uprc_cd%>
<%= curlistRec.send_yn%>
<%= curlistRec.qty%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 19 20:05:17 KST 2009 */