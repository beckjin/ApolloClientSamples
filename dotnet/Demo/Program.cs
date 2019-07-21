using Com.Ctrip.Framework.Apollo;
using Microsoft.AspNetCore;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;

namespace Demo
{
    public class Program
    {
        public static void Main(string[] args)
        {
            CreateWebHostBuilder(args).Build().Run();
        }

        public static IWebHostBuilder CreateWebHostBuilder(string[] args)
        {
            return WebHost.CreateDefaultBuilder(args)
                 .ConfigureAppConfiguration(builder => builder
                   .AddApollo(builder.Build().GetSection("apollo"))
                   .AddNamespace("TEST1.Common") // 命名空间
                   .AddDefault()) // 默认namespace: application
                   .UseStartup<Startup>();
        }
    }
}
