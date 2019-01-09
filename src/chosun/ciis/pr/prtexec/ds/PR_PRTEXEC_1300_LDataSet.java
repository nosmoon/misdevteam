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


package chosun.ciis.pr.prtexec.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_1300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTEXEC_1300_LDataSet(){}
	public PR_PRTEXEC_1300_LDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			PR_PRTEXEC_1300_LCURLISTRecord rec = new PR_PRTEXEC_1300_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.aply_dt = Util.checkString(rset1.getString("aply_dt"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.medi_cd_nm = Util.checkString(rset1.getString("medi_cd_nm"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.sect_cd_nm = Util.checkString(rset1.getString("sect_cd_nm"));
			rec.ecnt = Util.checkString(rset1.getString("ecnt"));
			rec.issu_pcnt = Util.checkString(rset1.getString("issu_pcnt"));
			rec.clr_pcnt = Util.checkString(rset1.getString("clr_pcnt"));
			rec.off_plat_tm = Util.checkString(rset1.getString("off_plat_tm"));
			rec.clr_off_plat_tm = Util.checkString(rset1.getString("clr_off_plat_tm"));
			rec.trsm_end_tm = Util.checkString(rset1.getString("trsm_end_tm"));
			rec.prt_bgn_tm = Util.checkString(rset1.getString("prt_bgn_tm"));
			rec.prt_end_tm = Util.checkString(rset1.getString("prt_end_tm"));
			rec.prt_qty = Util.checkString(rset1.getString("prt_qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PR_PRTEXEC_1300_LDataSet ds = (PR_PRTEXEC_1300_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PRTEXEC_1300_LCURLISTRecord curlistRec = (PR_PRTEXEC_1300_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.aply_dt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_cd_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_cd_nm%>
<%= curlistRec.ecnt%>
<%= curlistRec.issu_pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.off_plat_tm%>
<%= curlistRec.clr_off_plat_tm%>
<%= curlistRec.trsm_end_tm%>
<%= curlistRec.prt_bgn_tm%>
<%= curlistRec.prt_end_tm%>
<%= curlistRec.prt_qty%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 21 18:42:23 KST 2009 */