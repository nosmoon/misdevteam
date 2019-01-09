package chosun.ciis.co.lib.xi;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import kr.co.comsquare.rwXmlLib.RwXml;

public class RwXmlWrapper extends RwXml {
	
	public RwXmlWrapper()
	{
		super();
		initialize();
	}
	
	/**
	 * RwXml encoding을 설정.
	 */
	public void initialize()
	{
		setEncoding("EUC-KR");
	}
	
	/**
	 * 생성된 xml을 출력한다.
	 * @param out : JspWriter 개체. (통상 servlet/jsp의 out 개체)
	 * @throws IOException
	 */
	public void flush(JspWriter out) throws IOException
	{
		out.println(xmlFlush());
		out.println(xmlEndFlush());
	}
	
	/**
	 * xml에 포함되어서는 안되는 특수 문자 처리.
	 * @param src
	 * @return
	 */
	private String replace(String src)
	{
		if(src == null || src.equals(""))
			return "";
		
		if(src.indexOf("&")<0 
		   /*&& src.indexOf("!")<0*/ )
			return src;
			
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<src.length(); i++)
		{
			switch(src.charAt(i))
			{
				case '&' : sb.append("&amp;");
				           break;
				//아래는 RwXml에서 replaceToEscape 를 통해 ^, | , ! , \ 를 escape 처리하는 문제를 해결 하고자 추가.
				//-> viewer에서 &#033; 을 처리하지 않음. 그대로 표시됨. 따라서 override 방식 사용.
				/*case '!' : sb.append("&#033;");
		                   break;*/
				default : sb.append(src.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	/** 구분자가 존재하지 않는 데이터에서 구분자와 같은 문자를 쓰는 정보를 구분자와 구분할 수 없게 되는 
	 * 모호한 경우가 발생하는 것를 방지하기 위해 해당 문자를 Escape형으로 변환한다.
	 * ==> RwXml의 해당 함수가 ^, | , ! , \ 모두 escape 처리함으로써 발생하는 문제를 해결하고자 overriding 함.
	 *     "!" 를 제외한다.
	 *     주석 부분은 RwXml의 해당 함수.
	 * 
	 * @param data 구분자를 포함하지 않는 데이터.
	 * @return 처리된 후의 data
	 */	
	/*public String replaceToEscape(String data){ // ^, | , ! , \ 의 문자를 Escape문자로 변환.
		int i=0,substart=0;
		Vector vec=new Vector();
		
		StringBuffer strb = new StringBuffer(data);
		for(i=0;i<strb.length();++i){			
			if(strb.charAt(i)=='^'||strb.charAt(i)=='|'||strb.charAt(i)=='!'||strb.charAt(i)=='\\'){
				vec.addElement(strb.substring(substart,i));
				vec.addElement("\\"+strb.charAt(i));
				substart=i+1;
			}
		
		}
		vec.addElement(strb.substring(substart));
		strb=new StringBuffer();
		for(i=0;i<vec.size();++i){
			strb.append((String)vec.elementAt(i));	
		}
		return strb.toString();
	}*/
	public String replaceToEscape(String data){
		int i=0,substart=0;
		Vector vec=new Vector();
		
		StringBuffer strb = new StringBuffer(data);
		for(i=0;i<strb.length();++i){			
			if(strb.charAt(i)=='^'||strb.charAt(i)=='|'){
				vec.addElement(strb.substring(substart,i));
				vec.addElement("\\"+strb.charAt(i));
				substart=i+1;
			}
		
		}
		vec.addElement(strb.substring(substart));
		strb=new StringBuffer();
		for(i=0;i<vec.size();++i){
			strb.append((String)vec.elementAt(i));	
		}
		return strb.toString();
	}
	
	/**
	 * record 개체의 특정 필드를 xml 노드로 변환한다. 노드명은 해당 필드명을 사용한다.
	 * @param obj : record 개체.
	 * @param fld : 변환할 멤버 필드.
	 * @param depth : 노드가 소속될 상위 노드의 id
	 * @param nodeName
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	private void makeFieldToNode(Object obj, 
					            Field fld, 
					            int depth, 
					            String nodeName) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String name = fld.getName();
		String type = fld.getType().getName();
		
		//배열 개체는 제외한다.
		if("java.util.ArrayList".equals(type))
			return;
		
		if(nodeName!=null && !nodeName.trim().equals(""))
			name = nodeName;
		
		if("java.lang.String".equals(type))
			add(depth, name, replace((String)fld.get(obj)));
		else if("int".equals(type))
			add(depth, name, fld.getInt(obj));
		else if("long".equals(type))
			add(depth, name, fld.getLong(obj));
		else if("double".equals(type))
			add(depth, name, fld.getDouble(obj));
		else if("float".equals(type))
			add(depth, name, fld.getFloat(obj));
		else if("short".equals(type))
			add(depth, name, fld.getShort(obj));
		else
			add(depth, name, String.valueOf(fld.get(obj)));
	}
	
	/**
	 * record 개체를 노드셋으로 변환
	 * @param obj : record 개체.
	 * @param depth : 부모 노드의 id
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public void makeRecordToXml(Object obj, int depth) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		if(obj == null)
			return;
		
		Field[] flds = obj.getClass().getFields();
		try{
			for(int i=0; flds!=null && i<flds.length; i++)
			{
				makeFieldToNode(obj, flds[i], depth, null);
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * dataset 개체의 특정 record set을 노드셋으로 변환
	 * @param obj : dataset 개체.
	 * @param arrName : 변환할 record set의 필드명. 해당 필드는 반드시 ArrayList type 이어야 함.
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드 id
	 */
	public int makeDataToXml(Object obj, 
					          String arrName, 
					          int parentDepth, 
					          String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(obj == null)
			return ndepth;
		try{
			ndepth = add(parentDepth, nodeTag, "");
			rdepth = 0;
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					rdepth = add(ndepth, "record", "");
					makeRecordToXml(rec, rdepth);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * dataset 개체 자체를 대용량 처리를 위한 문자열에 추가. dataset 개체내 record 개체를 전환하는 것이 아니라 dataset개체의 멤버를 전환.
	 * @param obj : dataset 개체.
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드 id
	 */
	public int makeDataToXml(Object obj, 
					          int parentDepth, 
					          String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(obj == null)
			return ndepth;
		try{
			ndepth = add(parentDepth, nodeTag, "");
			makeRecordToXml(obj, ndepth);
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * record 개체의 특정 필드를 대용량 데이터 처리용 문자열에 추가. 노드명 추가일 경우 해당 필드명을 사용.
	 * @param obj : record 개체
	 * @param fld : 변환할 멤버 필드.
	 * @param title : 노드명 추가인지 여부
	 * @param rowend : 해당 필드가 record의 마지막 노드인지 여부.
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	private void makeFieldToBulk(Object obj, 
	            Field fld, 
	            boolean title, 
	            boolean rowend) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String type = fld.getType().getName();
		
		//배열 개체는 제외한다.
		if("java.util.ArrayList".equals(type))
			return;
		
		if(title)
		{
			if(rowend)
				add_RowVal(fld.getName());
			else
				add_ColVal(fld.getName());
		}
		else
		{
	
			if(rowend)
			{
				if("java.lang.String".equals(type))
					add_RowVal(replace((String)fld.get(obj)));
				else if("int".equals(type))
					add_RowVal(fld.getInt(obj));
				else if("long".equals(type))
					add_RowVal(fld.getLong(obj));
				else if("double".equals(type))
					add_RowVal(fld.getDouble(obj));
				else if("float".equals(type))
					add_RowVal(fld.getFloat(obj));
				else if("short".equals(type))
					add_RowVal(fld.getShort(obj));
				else
					add_RowVal(replace(String.valueOf(fld.get(obj))));
			}
			else
			{
				if("java.lang.String".equals(type))
					add_ColVal(replace((String)fld.get(obj)));
				else if("int".equals(type))
					add_ColVal(fld.getInt(obj));
				else if("long".equals(type))
					add_ColVal(fld.getLong(obj));
				else if("double".equals(type))
					add_ColVal(fld.getDouble(obj));
				else if("float".equals(type))
					add_ColVal(fld.getFloat(obj));
				else if("short".equals(type))
					add_ColVal(fld.getShort(obj));
				else
					add_ColVal(replace(String.valueOf(fld.get(obj))));
			}
		}
	}
	
	/**
	 * record 개체를 이용하여 대용량 처리를 위한 문자열의 title을 구성..
	 * @param obj : record 개체
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public void makeRecordToBulkTitle(Object obj) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		if(obj == null)
			return;
		
		Field[] flds = obj.getClass().getFields();
		try{
			if(flds!=null)
			{
				for(int i=0; i<flds.length; i++)
				{
					makeFieldToBulk(obj, flds[i], true, i == flds.length-1);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToBulkTitle] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToBulkTitle] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
		
	/**
	 * record 개체를 대용량 처리를 위한 문자열에 추가.
	 * @param obj : record 개체
	 * @param first : 대용량 처리 문자열에 처음으로 추가되는 record인지 여부. 첫번째의 경우 하부 필드 노드의 이름을 추가한다.
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public void makeRecordToBulk(Object obj, boolean first) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		if(obj == null)
			return;
		
		Field[] flds = obj.getClass().getFields();
		try{
			if(flds!=null)
			{
				if(first)
				{
					makeRecordToBulkTitle(obj);
				}
				for(int i=0; i<flds.length; i++)
				{
					makeFieldToBulk(obj, flds[i], false, i == flds.length-1);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToBulk] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToBulk] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * dataset 개체의 특정 record set을 대용량 처리를 위한 문자열에 추가.
	 * @param obj : dataset 개체
	 * @param arrName : 변환할 record set의 필드 명. 해당 필드는 반드시 ArrayList type 이어야 함.
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드의 id.
	 */
	public int makeDataToBulk(Object obj, 
					           String arrName, 
					           int parentDepth, 
					           String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
	
		if(obj == null)
			return ndepth;
		
		setHugeSep(colSep, rowSep); 
		
		try{
			ndepth = add(parentDepth, nodeTag, "");
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);

			if(arr!=null && arr.size()>0)
			{
				add(ndepth, "record", "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
				startHuge();
			
				for(int i=0; arr!=null && i<arr.size(); i++)
				{
					Object rec = arr.get(i);
					if(rec != null)
					{
						makeRecordToBulk(rec, i==0);
					}
				}
			
				endHuge();
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToBulk] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToBulk] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * dataset 개체 자체를 대용량 처리를 위한 문자열에 추가. dataset 개체내 record 개체를 전환하는 것이 아니라 dataset개체의 멤버를 전환.
	 * @param obj : dataset 개체
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드의 id.
	 */
	public int makeDataToBulk(Object obj, 
					           int parentDepth, 
					           String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
	
		if(obj == null)
			return ndepth;
		
		setHugeSep(colSep, rowSep); 
		
		try{
			ndepth = add(parentDepth, nodeTag, "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
			
			startHuge();
		
			makeRecordToBulk(obj, true);
		
			endHuge();
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToBulk] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToBulk] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * 대량 데이터 구조를 만들기 위한 초기 작업. record 개체로 자동 생성이 불가할 경우(데이터 가공 필요)에 사용.
	 * @param parentDepth
	 * @param nodeTag
	 */
	public void makeHugeStart(int parentDepth, String nodeTag)
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
		
		setHugeSep(colSep, rowSep); 
		ndepth = add(parentDepth, nodeTag, "");
		
		add(ndepth, "record", "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
		startHuge();
	}
	
	/**
	 * 대량 데이터 구조를 만들기 위한 초기 작업. record 개체로 자동 생성이 불가할 경우(데이터 가공 필요)에 사용.
	 * 실제 하위 데이터가 없는 상태에서 빈 record가 생성되는 것을 막기 위해 사용.
	 * 빈 record 가 있을 경우 조회가 반복될 때 (데이터가 없는 조회 후, 데이터가 1건인 조회를 실시할 때 
	 * model.send(.., true)로 하지 않고 특정 grid나 model을 refresh 해도 화면에 데이터가 표시되지 않는 trustform 버그 방지.
	 * @param parentDepth
	 * @param nodeTag
	 * @param dataSize : 실 데이터 사이즈. (ex. ds.arrayMember.size())
	 */
	public void makeHugeStart(int parentDepth, String nodeTag, int dataSize)
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
		
		setHugeSep(colSep, rowSep); 
		ndepth = add(parentDepth, nodeTag, "");
		
		if(dataSize>0)
			add(ndepth, "record", "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
		
		startHuge();
	}
	
	/**
	 * 대량 데이터 구조를 만들기 위한 초기 작업, record node의 이름을 지정할 수 있다.
	 * @param parentDepth
	 * @param nodeTag
	 * @param recTag
	 */
	public void makeHugeStart(int parentDepth, String nodeTag, String recTag)
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
		
		setHugeSep(colSep, rowSep); 
		ndepth = add(parentDepth, nodeTag, "");
		
		add(ndepth, recTag, "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
		startHuge();
	}
	
	/**
	 * 대량 데이터 구조를 만들기 위한 초기 작업, record node의 이름을 지정할 수 있다.
	 * @param parentDepth
	 * @param nodeTag
	 * @param recTag
	 * @param dataSize
	 */
	public void makeHugeStart(int parentDepth, String nodeTag, String recTag, int dataSize)
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
		
		setHugeSep(colSep, rowSep); 
		ndepth = add(parentDepth, nodeTag, "");
		
		if(dataSize>0)
			add(ndepth, recTag, "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
		
		startHuge();
	}
	
	/**
	 * List용 huge data start. record node를 "item" - "label", "value" 형식으로 만든다.
	 * @param parentDepth
	 * @param nodeTag
	 */
	public void makeHugeListStart(int parentDepth, String nodeTag)
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
		
		setHugeSep(colSep, rowSep); 
		ndepth = add(parentDepth, nodeTag, "");
		
		add(ndepth, "item", "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
		startHuge();
		
		addHugeListItem("label", "value");
	}
	
	/**
	 * List용 huge data start. record 및 하위 노드의 이름을 동적으로 받는다.
	 * @param parentDepth
	 * @param nodeTag
	 * @param labelTag
	 * @param valueTag
	 */
	public void makeHugeListStart(int parentDepth, String nodeTag, String labelTag, String valueTag)
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
		
		setHugeSep(colSep, rowSep); 
		ndepth = add(parentDepth, nodeTag, "");
		
		add(ndepth, "item", "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
		startHuge();
		
		addHugeListItem(labelTag, valueTag);
	}
	
	/**
	 * List용 huge data start. record node를 "item" - "label", "value" 형식으로 만든다. 
	 * 데이터 카운트를 체크하여 0건일 경우 record를 만들지 않는다.
	 * @param parentDepth
	 * @param nodeTag
	 * @param dataSize
	 */
	public void makeHugeListStart(int parentDepth, String nodeTag, int dataSize)
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
		
		setHugeSep(colSep, rowSep); 
		ndepth = add(parentDepth, nodeTag, "");
		
		if(dataSize>0)
			add(ndepth, "item", "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
		
		startHuge();
		
		if(dataSize>0)
			addHugeListItem("label", "value");
	}
	
	/**
	 * List용 huge data start. record 및 하위 노드의 이름을 동적으로 받는다.
	 * 데이터 카운트를 체크하여 0건일 경우 record를 만들지 않는다.
	 * @param parentDepth
	 * @param nodeTag
	 * @param labelTag
	 * @param valueTag
	 * @param dataSize
	 */
	public void makeHugeListStart(int parentDepth, String nodeTag, String labelTag, String valueTag, int dataSize)
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
		
		setHugeSep(colSep, rowSep); 
		ndepth = add(parentDepth, nodeTag, "");
		
		if(dataSize>0)
			add(ndepth, "item", "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
		
		startHuge();
		
		if(dataSize>0)
			addHugeListItem(labelTag, valueTag);
	}
	
	/**
	 * huge list에 label, value 쌍의 값을 추가.
	 * @param label
	 * @param value
	 */
	public void addHugeListItem(String label, String value)
	{
		add_ColVal(label);
		add_RowVal(value);
	}
	
	/**
	 * 대량 데이터 구조를 만드는 종료 작업. record 개체로 자동 생성이 불가할 경우(데이터 가공 필요)에 사용.
	 */
	public void makeHugeEnd()
	{
		endHuge();
	}
	
	/**
	 * record 개체의 필드를 이용하여 select 계열에 사용할 item 노드의 하위 label, value 노드를 생성.
	 * @param obj : record 개체.
	 * @param labelField : label 노드로 사용할 멤버 필드
	 * @param valueField : value 노드로 사용할 멤버 필드
	 * @param depth : 상위 item 노드의 id
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public void makeRecordToList(Object obj, 
					             String labelField, 
					             String valueField, 
					             int depth) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		if(obj == null)
			return;
		
		try{
			Field label = obj.getClass().getField(labelField);
			Field value = obj.getClass().getField(valueField);
			
			makeFieldToNode(obj, label, depth, "label");
			makeFieldToNode(obj, value, depth, "value");
		
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToList] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToList] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * record 개체의 필드를 이용하여 select 계열에 사용할 item 노드의 하위 label, value 노드를 생성.
	 * @param obj : record 개체.
	 * @param labelField : label 노드로 사용할 멤버 필드
	 * @param valueField : value 노드로 사용할 멤버 필드
	 * @param depth : 상위 item 노드의 id
	 * @param labelTag : label 노드의 노드명
	 * @param valueTag : value 노드의 노드명
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public void makeRecordToList(Object obj, 
					             String labelField, 
					             String valueField, 
					             int depth,
					             String labelTag,
					             String valueTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		if(obj == null)
			return;
		
		try{
			Field label = obj.getClass().getField(labelField);
			Field value = obj.getClass().getField(valueField);
			
			makeFieldToNode(obj, label, depth, labelTag);
			makeFieldToNode(obj, value, depth, valueTag);
		
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToList] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToList] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * dataset의 특정 record set을 이용하여 select 계열에 사용할 item 노드셋을 생성
	 * @param obj : dataset 개체
	 * @param arrName : 변환할 record set의 필드 명. 해당 필드는 반드시 ArrayList type 이어야 함.
	 * @param labelField : label 노드로 사용할 멤버필드 명.
	 * @param valueField : value 노드로 사용할 멤버필드 명.
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드의 id.
	 */
	public int makeDataToList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           int parentDepth, 
					           String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(obj == null)
			return ndepth;
		try{
			if(nodeTag==null || nodeTag.equals(""))
				ndepth = parentDepth;
			else
				ndepth = add(parentDepth, nodeTag, "");
			
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					rdepth = add(ndepth, "item", "");
					makeRecordToList(rec, labelField, valueField, rdepth);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToList] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToList] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * dataset의 특정 record set을 이용하여 select 계열에 사용할 item 노드셋을 생성
	 * @param obj : dataset 개체
	 * @param arrName : 변환할 record set의 필드 명. 해당 필드는 반드시 ArrayList type 이어야 함.
	 * @param labelField : label 노드로 사용할 멤버필드 명.
	 * @param valueField : value 노드로 사용할 멤버필드 명.
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @param recTag : record 노드의 노드명
	 * @param labelTag : label 노드의 노드명
	 * @param valueTag : value 노드의 노드명
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드의 id.
	 */
	public int makeDataToList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           int parentDepth, 
					           String nodeTag,
					           String recTag,
					           String labelTag,
					           String valueTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(obj == null)
			return ndepth;
		try{
			if(nodeTag==null || nodeTag.equals(""))
				ndepth = parentDepth;
			else
				ndepth = add(parentDepth, nodeTag, "");
			
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					rdepth = add(ndepth, recTag, "");
					makeRecordToList(rec, labelField, valueField, rdepth, labelTag, valueTag);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToList] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToList] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * dataset의 특정 record set을 이용하여 select 계열에 사용할 item 노드셋을 생성
	 * @param obj : dataset 개체
	 * @param arrName : 변환할 record set의 필드 명. 해당 필드는 반드시 ArrayList type 이어야 함.
	 * @param labelField : label 노드로 사용할 멤버필드 명.
	 * @param valueField : value 노드로 사용할 멤버필드 명.
	 * @param allItemLabel : 전체/선택 item 의 label
	 * @param allItemValue : 전체/선택 item 의 value
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드의 id.
	 */
	public int makeDataToList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           String allItemLabel,
					           String allItemValue,
					           int parentDepth, 
					           String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(nodeTag==null || nodeTag.equals(""))
			ndepth = parentDepth;
		else
			ndepth = add(parentDepth, nodeTag, "");
		
		addSelectItem(ndepth, allItemLabel, allItemValue);
		
		if(obj == null)
			return ndepth;
		try{
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					rdepth = add(ndepth, "item", "");
					makeRecordToList(rec, labelField, valueField, rdepth);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToList] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToList] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * dataset의 특정 record set을 이용하여 select 계열에 사용할 item 노드셋을 생성
	 * @param obj : dataset 개체
	 * @param arrName : 변환할 record set의 필드 명. 해당 필드는 반드시 ArrayList type 이어야 함.
	 * @param labelField : label 노드로 사용할 멤버필드 명.
	 * @param valueField : value 노드로 사용할 멤버필드 명.
	 * @param allItemLabel : 전체/선택 item 의 label
	 * @param allItemValue : 전체/선택 item 의 value
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @param recTag : record 노드의 노드명
	 * @param labelTag : label 노드의 노드명
	 * @param valueTag : value 노드의 노드명
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드의 id.
	 */
	public int makeDataToList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           String allItemLabel,
					           String allItemValue,
					           int parentDepth, 
					           String nodeTag,
					           String recTag,
					           String labelTag,
					           String valueTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(nodeTag==null || nodeTag.equals(""))
			ndepth = parentDepth;
		else
			ndepth = add(parentDepth, nodeTag, "");
		
		addSelectItem(ndepth, recTag, labelTag, valueTag, allItemLabel, allItemValue);
		
		if(obj == null)
			return ndepth;
		try{
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					rdepth = add(ndepth, recTag, "");
					makeRecordToList(rec, labelField, valueField, rdepth, labelTag, valueTag);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToList] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToList] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * list용 bulk data를 만들기 위해 title node를 설정.
	 * @param labelTag
	 * @param valueTag
	 */
	public void makeRecordToBulkListTitle(String labelTag, String valueTag)
	{
		addHugeListItem(labelTag, valueTag);
	}
	
	/** 
	 * record 개체를 대용량 처리를 위한 문자열에 추가. select용 list data 전용.
	 * @param obj : record 개체
	 * @param labelField : label로 사용할 필드명.
	 * @param valueField : value로 사용할 필드명.
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public void makeRecordToBulkList(Object obj, 
									 String labelField, 
									 String valueField) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		if(obj == null)
			return;
		
		try{
			Field label = obj.getClass().getField(labelField);
			Field value = obj.getClass().getField(valueField);
			
			makeFieldToBulk(obj, label, false, false);
			makeFieldToBulk(obj, value, false, true);
			
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToBulkList] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToBulkList] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	
	/** 
	 * dataset의 특정 record set을 이용하여 select 계열에 사용할 item 노드셋을 생성. bulk 데이터로 생성.
	 * @param obj : dataset 개체
	 * @param arrName : 변환할 record set의 필드 명. 해당 필드는 반드시 ArrayList type 이어야 함.
	 * @param labelField : label 노드로 사용할 멤버필드 명.
	 * @param valueField : value 노드로 사용할 멤버필드 명.
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드의 id.
	 */
	public int makeDataToBulkList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           int parentDepth, 
					           String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String rowSep = "|";
		String colSep = "^";
		String recordTagName = "item";
		String labelTagName = "label";
		String valueTagName = "value";
		int ndepth = 0;
	
		if(obj == null)
			return ndepth;
		
		setHugeSep(colSep, rowSep); 
		
		try{
			ndepth = add(parentDepth, nodeTag, "");
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			if(arr!=null && arr.size()>0)
			{
				add(ndepth, recordTagName, "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
				startHuge();
				
				makeRecordToBulkListTitle(labelTagName, valueTagName);
			
				for(int i=0; arr!=null && i<arr.size(); i++)
				{
					Object rec = arr.get(i);
					if(rec != null)
					{
						makeRecordToBulkList(rec, labelField, valueField);
					}
				}
			
				endHuge();
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToBulkList] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToBulkList] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/** -------------------------
	 * dataset의 특정 record set을 이용하여 select 계열에 사용할 item 노드셋을 생성. 대용량 bulk 데이터로 생성.
	 * @param obj : dataset 개체
	 * @param arrName : 변환할 record set의 필드 명. 해당 필드는 반드시 ArrayList type 이어야 함.
	 * @param labelField : label 노드로 사용할 멤버필드 명.
	 * @param valueField : value 노드로 사용할 멤버필드 명.
	 * @param allItemLabelg : 전체/선택 item 의 label
	 * @param allItemValue : 전체/선택 item 의 value
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드의 id.
	 */
	public int makeDataToBulkList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           String allItemLabel,
					           String allItemValue,
					           int parentDepth, 
					           String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String rowSep = "|";
		String colSep = "^";
		String recordTagName = "item";
		String labelTagName = "label";
		String valueTagName = "value";
		int ndepth = 0;
	
		if(obj == null)
			return ndepth;
		
		setHugeSep(colSep, rowSep); 
		
		try{
			ndepth = add(parentDepth, nodeTag, "");
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			add(ndepth, recordTagName, "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
			startHuge();
			
			makeRecordToBulkListTitle(labelTagName, valueTagName);
			addHugeListItem(allItemLabel, allItemValue);
		
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					makeRecordToBulkList(rec, labelField, valueField);
				}
			}
		
			endHuge();
			
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToBulkList] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToBulkList] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/** 
	 * dataset의 특정 record set을 이용하여 select 계열에 사용할 item 노드셋을 생성. bulk 데이터로 생성.
	 * @param obj : dataset 개체
	 * @param arrName : 변환할 record set의 필드 명. 해당 필드는 반드시 ArrayList type 이어야 함.
	 * @param labelField : label 노드로 사용할 멤버필드 명.
	 * @param valueField : value 노드로 사용할 멤버필드 명.
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @param recTag : record 노드의 노드명
	 * @param labelTag : label 노드의 노드명
	 * @param valueTag : value 노드의 노드명
	 * @param useListDefaultForTag : labelTag/valueTag를 지정하지 않을 경우, default(label/value)값을 사용할지 필드명을 사용할지 여부.
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드의 id.
	 */
	public int makeDataToBulkList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           int parentDepth, 
					           String nodeTag,
					           String recTag,
					           String labelTag,
					           String valueTag,
					           boolean useListDefaultForTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String rowSep = "|";
		String colSep = "^";
		String recordTagName = "item";
		String labelTagName = labelTag;
		String valueTagName = valueTag;
		int ndepth = 0;
	
		if(obj == null)
			return ndepth;
		
		setHugeSep(colSep, rowSep); 
		
		try{
			ndepth = add(parentDepth, nodeTag, "");
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			if(recTag!=null && !recTag.trim().equals(""))
				recordTagName = recTag;
			if(labelTagName==null || labelTagName.trim().equals("") || valueTagName==null || valueTagName.trim().equals(""))
			{
				if(useListDefaultForTag)
				{
					labelTagName = "label";
					valueTagName = "value";
				}
				else
				{
					labelTagName = labelField;
					valueTagName = valueField;
				}
			}

			if(arr!=null && arr.size()>0)
			{
				add(ndepth, recordTagName, "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
				startHuge();
				
				makeRecordToBulkListTitle(labelTagName, valueTagName);
			
				for(int i=0; arr!=null && i<arr.size(); i++)
				{
					Object rec = arr.get(i);
					if(rec != null)
					{
						makeRecordToBulkList(rec, labelField, valueField);
					}
				}
			
				endHuge();
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToBulkList] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToBulkList] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/** -------------------------
	 * dataset의 특정 record set을 이용하여 select 계열에 사용할 item 노드셋을 생성. 대용량 bulk 데이터로 생성.
	 * @param obj : dataset 개체
	 * @param arrName : 변환할 record set의 필드 명. 해당 필드는 반드시 ArrayList type 이어야 함.
	 * @param labelField : label 노드로 사용할 멤버필드 명.
	 * @param valueField : value 노드로 사용할 멤버필드 명.
	 * @param allItemLabelg : 전체/선택 item 의 label
	 * @param allItemValue : 전체/선택 item 의 value
	 * @param parentDepth : 부모 노드 id
	 * @param nodeTag : 추가될 노드 묶음의 root 노드명
	 * @param recTag : record 노드의 노드명
	 * @param labelTag : label 노드의 노드명
	 * @param valueTag : value 노드의 노드명
	 * @param useListDefaultForTag : labelTag/valueTag를 지정하지 않을 경우, default(label/value)값을 사용할지 필드명을 사용할지 여부.
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. 생성된 노드의 id.
	 */
	public int makeDataToBulkList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           String allItemLabel,
					           String allItemValue,
					           int parentDepth, 
					           String nodeTag,
					           String recTag,
					           String labelTag,
					           String valueTag,
					           boolean useListDefaultForTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String rowSep = "|";
		String colSep = "^";
		String recordTagName = "item";
		String labelTagName = labelTag;
		String valueTagName = valueTag;
		int ndepth = 0;
	
		if(obj == null)
			return ndepth;
		
		setHugeSep(colSep, rowSep); 
		
		try{
			ndepth = add(parentDepth, nodeTag, "");
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			if(recTag!=null && !recTag.trim().equals(""))
				recordTagName = recTag;
			if(labelTagName==null || labelTagName.trim().equals("") || valueTagName==null || valueTagName.trim().equals(""))
			{
				if(useListDefaultForTag)
				{
					labelTagName = "label";
					valueTagName = "value";
				}
				else
				{
					labelTagName = labelField;
					valueTagName = valueField;
				}
			}

			add(ndepth, recordTagName, "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
			startHuge();
			
			makeRecordToBulkListTitle(labelTagName, valueTagName);
			addHugeListItem(allItemLabel, allItemValue);
		
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					makeRecordToBulkList(rec, labelField, valueField);
				}
			}
		
			endHuge();

		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToBulkList] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToBulkList] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * 빈 item 하나를 가지는 리스트 노드를 생성한다.
	 * 빈 item 의 값을 지정할 수 있다.
	 * @param depth : 부모 노드 id
	 * @param nodeName : 노드명
	 * @param allItemLabel : lable
	 * @param allItemValue : value
	 * @return
	 */
	public int makeEmpytList(int depth, String nodeName, String allItemLabel, String allItemValue)
	{
		int parent = makeParentNode(depth, nodeName);
		
		addSelectItem(parent, allItemLabel, allItemValue);
		
		return parent;
	}
	
	/**
	 * 빈 item 하나를 가지는 리스트 노드를 생성한다.
	 * 빈 item 의 item, label, value node명과 그 값을 지정할 수 있다.
	 * @param depth : 부모 노드 id
	 * @param nodeName : 노드명
	 * @param recordName : record 노드 명
	 * @param labelName : label 노드명
	 * @param valuName : value 노드명
	 * @param allItemLabel : default item 의 label
	 * @param allItemValue : default item 의 value
	 * @return
	 */
	public int makeEmpytList(int depth, String nodeName, String recordName, String labelName, String valuName, String allItemLabel, String allItemValue)
	{
		int parent = makeParentNode(depth, nodeName);
		
		addSelectItem(parent, recordName, labelName, valuName, allItemLabel, allItemValue);
		
		return parent;
	}
	
	/**
	 * value가 없는 빈 노드를 생성.
	 * @param depth : 부모 노드 id
	 * @param nodeName : 생성할 노드명
	 * @return : 생성된 노드의 id
	 */
	public int makeEmptyNode(int depth, String nodeName)
	{
		return add(depth, nodeName, "");
	}
	
	/**
	 * 앞으로 생성할 노드 묶음의 parent 노드를 생성. 값이 없는 빈 노드가 생성된다.
	 * @param depth : 부모 노드 id
	 * @param nodeName : 생성할 노드명
	 * @return : 생성된 노드의 id
	 */
	public int makeParentNode(int depth, String nodeName)
	{
		return makeEmptyNode(depth, nodeName);
	}
	
	/**
	 * list에 사용될 노드에 item 노드를 추가한고 label과 value parameter의 값으로 item 노드의 하위의 label, value 노드를 함께 생성한다.
	 * @param depth : item 노드를 추가할 부모 노드 id
	 * @param label : item 노드에 추가될 label 노드의 값.
	 * @param value : item 노드에 추가될 value 노드의 값.
	 */
	public void addSelectItem(int depth, String label, String value)
	{
		int item = makeEmptyNode(depth, "item");
		
		add(item, "label", label==null ? "" : label);
		add(item, "value", value==null ? "" : value);
	}
	
	/**
	 * list에 사용될 노드에 record명의 노드를 추가하고 label과 value parameter의 값으로 item 노드의 하위노드를 함께 생성한다.
	 * @param depth : item 노드를 추가할 부모 노드 id
	 * @param label : item 노드에 추가될 label 노드의 값.
	 * @param value : item 노드에 추가될 value 노드의 값.
	 */
	public void addSelectItem(int depth, String recordName, String labelName, String valuName, String label, String value)
	{
		int item = makeEmptyNode(depth, recordName);
		
		add(item, labelName, label==null ? "" : label);
		add(item, valuName, value==null ? "" : value);
	}
	
	/**
	 * 공통 에러 처리. CIIS 공통 에러 처리 script에 맞게 메시지를 구성. 자동으로 화면에서 에러 alert를 발생시킴.
	 * @param errCode : error code.
	 * @param errMsg : error message.
	 * @return
	 */
	public int setErrorMessage(String errCode, String errMsg)
	{
		int msg = add(rootNodeID, "errData", "");
		add(msg, "errcode", errCode);
		add(msg, "errmsg", errMsg);
		
		return msg;
	}
	
	/**
	 * 공통 메시지 처리. CIIS 공통 처리 script에 맞게 메시지를 구성. 자동으로 화면에서 처리 결과 alert를 발생시킴.
	 * @param status : 상태값
	 * @param message : 메시지
	 * @return
	 */
	public int setReturnMessage(String status, String message)
	{
		int msg = add(rootNodeID, "msgData", "");
		add(msg, "statusMsg", status);
		add(msg, "resultMsg", message);
		
		return msg;
	}
	
	/**
	 * 공통 에러처리. error code는 "ERROR"
	 * @param message : 메시지
	 * @return
	 */
	public int setErrorAlert(String message)
	{
		return setErrorMessage("ERROR", message);
	}
	
	/**
	 * 공통 메시지처리. message code는 "OK" 
	 * @param message : 메시지
	 * @return
	 */
	public int setMessageAlert(String message)
	{
		return setReturnMessage("OK", message);
	}
}
