using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Configuration;
using System.Threading.Tasks;

namespace Demo.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ValuesController : ControllerBase
    {
        private IConfiguration _configration;

        public ValuesController(IConfiguration configuration)
        {
            _configration = configuration;
        }

        [HttpGet]
        public async Task<object> Get()
        {
            await Task.CompletedTask;

            return new
            {
                Name = _configration["name"],
                Company = _configration["company"],
                Url = _configration["url"]
            };
        }
    }
}
