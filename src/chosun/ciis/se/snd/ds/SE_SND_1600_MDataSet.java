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


public class SE_SND_1600_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList prtlist = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList medilist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_1600_MDataSet(){}
	public SE_SND_1600_MDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			SE_SND_1600_MCURLISTRecord rec = new SE_SND_1600_MCURLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			SE_SND_1600_MPRTLISTRecord rec = new SE_SND_1600_MPRTLISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.prtlist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(7);
		while(rset4.next()){
			SE_SND_1600_MMEDILISTRecord rec = new SE_SND_1600_MMEDILISTRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			this.medilist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_1600_MDataSet ds = (SE_SND_1600_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_1600_MCURLISTRecord curlistRec = (SE_SND_1600_MCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.prtlist.size(); i++){
		SE_SND_1600_MPRTLISTRecord prtlistRec = (SE_SND_1600_MPRTLISTRecord)ds.prtlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.medilist.size(); i++){
		SE_SND_1600_MMEDILISTRecord medilistRec = (SE_SND_1600_MMEDILISTRecord)ds.medilist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getPrtlist()%>
<%= ds.getMedilist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= prtlistRec.cd%>
<%= prtlistRec.cdnm%>
<%= prtlistRec.cd_abrv_nm%>
<%= medilistRec.cd%>
<%= medilistRec.cdnm%>
<%= medilistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 13 17:34:20 KST 2009 */