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


package chosun.ciis.mt.papord.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.rec.*;


/**
 * 
 */


public class MT_PAPORD_8003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_8003_LDataSet(){}
	public MT_PAPORD_8003_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MT_PAPORD_8003_LCURLISTRecord rec = new MT_PAPORD_8003_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_yy = Util.checkString(rset0.getString("occr_yy"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.fix_clsf = Util.checkString(rset0.getString("fix_clsf"));
			rec.fix_clsf_nm = Util.checkString(rset0.getString("fix_clsf_nm"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.chg_tm = Util.checkString(rset0.getString("chg_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PR_PRTEXEC_4003_LDataSet ds = (PR_PRTEXEC_4003_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PRTEXEC_4003_LCURLISTRecord curlistRec = (PR_PRTEXEC_4003_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_yy%>
<%= curlistRec.seq%>
<%= curlistRec.frdt%>
<%= curlistRec.todt%>
<%= curlistRec.fix_clsf%>
<%= curlistRec.fix_clsf_nm%>
<%= curlistRec.chg_dt%>
<%= curlistRec.chg_tm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 12 22:20:23 KST 2009 */