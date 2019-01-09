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


public class SE_SND_2320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2320_LDataSet(){}
	public SE_SND_2320_LDataSet(String errcode, String errmsg){
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
			SE_SND_2320_LCURLISTRecord rec = new SE_SND_2320_LCURLISTRecord();
			rec.tran_uprc_clas = Util.checkString(rset0.getString("tran_uprc_clas"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.tran_cmpy_cd = Util.checkString(rset0.getString("tran_cmpy_cd"));
			rec.uprc_seq = Util.checkString(rset0.getString("uprc_seq"));
			rec.tran_uprc_cd = Util.checkString(rset0.getString("tran_uprc_cd"));
			rec.tran_uprc_route_nm = Util.checkString(rset0.getString("tran_uprc_route_nm"));
			rec.prt_plac_cd = Util.checkString(rset0.getString("prt_plac_cd"));
			rec.route_clsf_nm = Util.checkString(rset0.getString("route_clsf_nm"));
			rec.tran_cost = Util.checkString(rset0.getString("tran_cost"));
			rec.route_clsf = Util.checkString(rset0.getString("route_clsf"));
			rec.route_cd = Util.checkString(rset0.getString("route_cd"));
			rec.route_nm = Util.checkString(rset0.getString("route_nm"));
			rec.cnsg_seqo = Util.checkString(rset0.getString("cnsg_seqo"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_2320_LDataSet ds = (SE_SND_2320_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2320_LCURLISTRecord curlistRec = (SE_SND_2320_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.tran_uprc_clas%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.tran_cmpy_cd%>
<%= curlistRec.uprc_seq%>
<%= curlistRec.tran_uprc_cd%>
<%= curlistRec.tran_uprc_route_nm%>
<%= curlistRec.prt_plac_cd%>
<%= curlistRec.route_clsf_nm%>
<%= curlistRec.tran_cost%>
<%= curlistRec.route_clsf%>
<%= curlistRec.route_cd%>
<%= curlistRec.route_nm%>
<%= curlistRec.cnsg_seqo%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jun 22 13:36:49 KST 2009 */