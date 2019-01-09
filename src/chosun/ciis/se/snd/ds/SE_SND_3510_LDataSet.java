/***************************************************************************************************
* ���ϸ� : SE_SND_3510_LDataSet
* ��� : �Ǹ� - �߼۰��� - ��Ÿ�μ�ó����
* �ۼ����� : 2009-03-24
* �ۼ��� : ������
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


public class SE_SND_3510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_3510_LDataSet(){}
	public SE_SND_3510_LDataSet(String errcode, String errmsg){
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
			SE_SND_3510_LCURLISTRecord rec = new SE_SND_3510_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.route_clsf = Util.checkString(rset0.getString("route_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.asin_prt_plac_cd = Util.checkString(rset0.getString("asin_prt_plac_cd"));
			rec.real_prt_plac_cd = Util.checkString(rset0.getString("real_prt_plac_cd"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_3510_LDataSet ds = (SE_SND_3510_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_3510_LCURLISTRecord curlistRec = (SE_SND_3510_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.route_clsf%>
<%= curlistRec.medi_cd%>
<%= curlistRec.asin_prt_plac_cd%>
<%= curlistRec.real_prt_plac_cd%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 24 12:30:21 KST 2009 */