package w13_1.decoratorPattern;

import w13_1.decoratorPattern.component.DataSource;

public class DataSourceDecorator implements DataSource{
    private DataSource dataSource;
    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void write(String data){
        dataSource.write(data);
    }
    @Override
    public String read(){
        return dataSource.read();
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
